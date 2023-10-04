package com.example.APIGateway.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.APIGateway.model.PersonAddressEntity;

public interface PersonAddressRepository extends JpaRepository<PersonAddressEntity,Long> {
}


