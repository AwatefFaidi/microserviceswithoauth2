package com.example.APIGateway.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.example.APIGateway.constraint.UserStatus;
import com.example.APIGateway.dto.AddressDTO;
import com.example.APIGateway.dto.UserSignupDTO;
import com.example.APIGateway.model.PersonAddressEntity;
import com.example.APIGateway.model.PersonProfileEntity;
import com.example.APIGateway.model.UserEntity;

import java.io.Serializable;
import java.time.LocalDateTime;


@Component
public class MapperUserService implements Serializable {

    @Autowired private PasswordEncoder passwordEncoder;

    public UserEntity mapUserFromDTO(UserSignupDTO userSignupDTO) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName(userSignupDTO.getUserName());
        userEntity.setStatus(UserStatus.ACTIVE.getStatus());
        userEntity.setPassword(passwordEncoder.encode(userSignupDTO.getPassword()));
        userEntity.setCreateDate(LocalDateTime.now());
        return userEntity;
    }

    public PersonProfileEntity mapPersonFromDTO(UserSignupDTO userSignupDTO) {
        PersonProfileEntity profileEntity = new PersonProfileEntity();
        profileEntity.setFirstName(userSignupDTO.getFirstName());
        profileEntity.setMiddleName(userSignupDTO.getMiddleName());
        profileEntity.setLastName(userSignupDTO.getLastName());
        profileEntity.setDateOfBirth(userSignupDTO.getDateOfBirth());
        profileEntity.setGender(userSignupDTO.getGender());
        profileEntity.setEmail(userSignupDTO.getEmail());
        profileEntity.setCellPhone(userSignupDTO.getCellPhone());
        profileEntity.setHomePhone(userSignupDTO.getHomePhone());
        profileEntity.setWorkPhone(userSignupDTO.getWorkPhone());
        profileEntity.setOccupation(userSignupDTO.getOccupation());
        profileEntity.setEmployer(userSignupDTO.getEmployer());
        profileEntity.setCreateDate(LocalDateTime.now());
        return profileEntity;
    }

    public PersonAddressEntity mapAddressFromDTO(AddressDTO addressDTO) {
        PersonAddressEntity addressEntity = new PersonAddressEntity();
        addressEntity.setAddressLineOne(addressDTO.getAddressLineOne());
        addressEntity.setAddressLineTwo(addressDTO.getAddressLineTwo());
        addressEntity.setAddressType(addressDTO.getAddressType());
        addressEntity.setProvince(addressDTO.getProvince());
        addressEntity.setCity(addressDTO.getCity());
        addressEntity.setPostalCode(addressDTO.getPostalCode());
        return addressEntity;
    }
}
