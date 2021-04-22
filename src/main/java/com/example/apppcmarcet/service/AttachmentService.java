package com.example.apppcmarcet.service;

import com.example.apppcmarcet.entity.Attachment;
import com.example.apppcmarcet.entity.AttachmentContent;
import com.example.apppcmarcet.repository.AttachmentContentRepository;
import com.example.apppcmarcet.repository.AttachmentRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import java.util.Iterator;
import java.util.Optional;

@Service
public class AttachmentService {
    @Autowired
    AttachmentRepository attachmentRepository;

    @Autowired
    AttachmentContentRepository attachmentContentRepository;


    /**
     * UPLOAD FILE
     *
     * @param request
     * @return STRING
     */
    @SneakyThrows
    public Boolean upload(MultipartHttpServletRequest request) {
        Iterator<String> fileNames = request.getFileNames();
        MultipartFile file = request.getFile(fileNames.next());

        if (file != null) {
            Attachment attachment = new Attachment();
            attachment.setName(file.getName());
            attachment.setSize(file.getSize());
            attachment.setContentType(file.getContentType());
            Attachment savedAttachment = attachmentRepository.save(attachment);

            AttachmentContent attachmentContent = new AttachmentContent();
            attachmentContent.setBytes(file.getBytes());
            attachmentContent.setAttachment(savedAttachment);
            attachmentContentRepository.save(attachmentContent);
            return true;
        }
        return false;
    }


    /**
     * DOWNLOAD FILE
     *
     * @param id       INTEGER
     * @param response
     * @return STRING
     */
    @SneakyThrows
    public Boolean download(Integer id, HttpServletResponse response) {
        Optional<Attachment> optionalAttachment = attachmentRepository.findById(id);
        if (!optionalAttachment.isPresent()) {
            return false;
        }
        Attachment attachment = optionalAttachment.get();

        Optional<AttachmentContent> optionalAttachmentContent = attachmentContentRepository.findByAttachmentId(attachment.getId());
        if (!optionalAttachmentContent.isPresent()) {
            return false;
        }
        AttachmentContent attachmentContent = optionalAttachmentContent.get();
        response.setHeader("Content-Disposition",
                "attachment; filename=\"" + attachment.getName() +"\"");
        response.setContentType(attachment.getContentType());
        FileCopyUtils.copy(attachmentContent.getBytes(), response.getOutputStream());
        return true;
    }
}
