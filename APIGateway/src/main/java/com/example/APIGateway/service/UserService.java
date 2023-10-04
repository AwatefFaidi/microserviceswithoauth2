package com.example.APIGateway.service;

import com.example.APIGateway.dto.UserSignupDTO;
import com.example.APIGateway.model.UserEntity;

public interface UserService {

    String signup(UserSignupDTO userSignupDTO);

    UserEntity findByUserName(String userName);
}