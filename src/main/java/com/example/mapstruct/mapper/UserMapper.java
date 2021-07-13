package com.example.mapstruct.mapper;

import com.example.mapstruct.dto.UserDto;
import com.example.mapstruct.model.Rol;
import com.example.mapstruct.model.User;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {


        User userDtoToUser(UserDto userDto);


        default  List<Rol> mapi(List<String> value){
                List<Rol> rolesString = new ArrayList<Rol>();
                value.stream().forEach((t)->rolesString.add(new Rol(t)));
                return  rolesString;
        }

}
