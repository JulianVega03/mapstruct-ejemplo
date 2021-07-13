package com.example.mapstruct.controller;

import com.example.mapstruct.dto.UserDto;
import com.example.mapstruct.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public void test(){
        UserDto userDto = new UserDto();
        userDto.setName("julian");
        userDto.setAge(22);
        List a = new ArrayList<String>();
        a.add("admin");
        userDto.setRoles(a);
        userDto.setCreatedAt("23/03/1999");
        userDto.setSum(123);
        userService.inset(userDto);
    }
}
