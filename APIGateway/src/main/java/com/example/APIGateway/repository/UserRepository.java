package com.example.APIGateway.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.APIGateway.model.UserEntity;


public interface UserRepository extends JpaRepository<UserEntity,Long> {

    UserEntity findByUserNameAndStatus(String userName, String status);

    UserEntity findByUserName(String userName);
}
