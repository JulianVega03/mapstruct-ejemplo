package com.example.mapstruct.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserDto {

    private String name;
    private Integer age;
    private List<String> roles;
    private Integer sum;
    private String createdAt;

}
