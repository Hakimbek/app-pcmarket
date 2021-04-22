package com.example.apppcmarcet.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "model must not be empty")
    private String model;

    @NotNull(message = "brand must not be empty")
    private String brand;

    @NotNull(message = "price must not be empty")
    private Double price;

    private Integer guarantee;

    @ManyToOne(optional = false)
    private Catalog catalog;

    @ManyToMany
    private List<Comment> comment;
}
