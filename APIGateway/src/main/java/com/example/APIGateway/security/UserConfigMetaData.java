package com.example.APIGateway.security;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.APIGateway.model.UserEntity;
import com.example.APIGateway.service.UserService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.*;
@Slf4j
@Component
public class UserConfigMetaData implements Serializable {

    @Autowired
    private UserService userService;


    public Map<String, Object> getUserRelatedInformation(String userName) {
        Map<String, Object> maps = new HashMap<>();
        UserEntity userEntity = userService.findByUserName(userName);
        maps.put("user_role", userEntity.getUserRoleEntity().getRoleName());
        maps.put("userName", userEntity.getUserName());
        maps.put("fullName", userEntity.getPersonProfileEntity().getFirstName().concat(" ").concat(userEntity.getPersonProfileEntity().getLastName()));
        maps.put("email", userEntity.getPersonProfileEntity().getEmail());
        return maps;
    }

}
