package com.vaishu.springbootproject.dto;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ErrorDetails {

    private Date timestamp;

    private String status;

    private String message;
}
