package com.example.apppcmarcet.controller;

import com.example.apppcmarcet.service.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/attachment")
public class AttachmentController {
    @Autowired
    AttachmentService attachmentService;


    /**
     * UPLOAD FILE
     *
     * @param request
     * @return STRING
     */
    @PostMapping("/upload")
    public ResponseEntity<?> upload(MultipartHttpServletRequest request) {
        Boolean upload = attachmentService.upload(request);
        return ResponseEntity.status(upload ? 200 : 409).body("Successfully uploaded");
    }


    /**
     * DOWNLOAD FILE
     *
     * @param id       INTEGER
     * @param response
     * @return STRING
     */
    @GetMapping("/download/{id}")
    public ResponseEntity<?> download(@PathVariable Integer id, HttpServletResponse response) {
        Boolean download = attachmentService.download(id, response);
        return ResponseEntity.status(download ? 200 : 409).body("Downloaded");
    }
}
