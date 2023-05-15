package com.vaishu.springbootproject.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProductDtoPriceOnly {

    private Long pid;

    private Double price;
}
