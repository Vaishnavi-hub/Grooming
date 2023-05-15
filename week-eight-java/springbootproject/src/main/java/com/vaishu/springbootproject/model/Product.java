package com.vaishu.springbootproject.model;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "p_id")
    private Long pid;

    @Column(name = "p_name", nullable = false)
    private String pname;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private String category;
}
