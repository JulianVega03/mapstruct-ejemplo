package com.example.mapstruct.service;

import com.example.mapstruct.dto.UserDto;
import com.example.mapstruct.mapper.UserMapper;
import com.example.mapstruct.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public void inset(UserDto userDto){
        userMapper.userDtoToUser(userDto);
    }

    public void save(User user){

    }


}
