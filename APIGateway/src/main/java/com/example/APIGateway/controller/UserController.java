package com.example.APIGateway.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.APIGateway.dto.UserSignupDTO;
import com.example.APIGateway.service.UserService;
import com.example.APIGateway.util.CommonResponse;

import javax.validation.Valid;
import java.io.Serializable;


@RestController
public class UserController implements Serializable {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired private UserService userService;

    @PostMapping(path = "/signup", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CommonResponse> userSignup(@Valid @RequestBody UserSignupDTO userSignupDTO) {
        LOGGER.info("Request Received for userSignup() ...");
        String result =  userService.signup(userSignupDTO);
        if(result.equalsIgnoreCase(HttpStatus.OK.name())){
            return new ResponseEntity<>(new CommonResponse("Signup Successful", true, null, HttpStatus.CREATED.value()), HttpStatus.CREATED);
        }
        return new ResponseEntity<>(new CommonResponse("Ssignup process is not completed. Please contact customer support.", true, null, HttpStatus.EXPECTATION_FAILED.value()), HttpStatus.EXPECTATION_FAILED);
    }
}