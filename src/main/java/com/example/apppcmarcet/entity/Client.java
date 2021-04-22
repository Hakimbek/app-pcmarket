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
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "name must not be empty")
    private String name;

    @NotNull(message = "address must not be empty")
    private String address;

    @NotNull(message = "phone must not be empty")
    private String phone;

    private String email;

    @OneToMany
    private List<Product> product;
}
