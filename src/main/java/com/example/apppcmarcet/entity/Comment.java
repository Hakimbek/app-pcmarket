package com.example.apppcmarcet.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "userName must not be empty")
    private String userName;

    @NotNull(message = "userEmail must not be empty")
    private String userEmail;

    @NotNull(message = "comment must not be empty")
    private String comment;

    @ManyToOne
    private Product product;
}
