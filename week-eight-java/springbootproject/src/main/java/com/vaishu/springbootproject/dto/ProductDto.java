package com.vaishu.springbootproject.dto;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProductDto {

    private Long pid;

    private String pname;

    private Double price;

    private String category;
}
