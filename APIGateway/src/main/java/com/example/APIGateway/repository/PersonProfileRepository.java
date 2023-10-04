package com.example.APIGateway.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.APIGateway.model.PersonProfileEntity;


public interface PersonProfileRepository extends JpaRepository<PersonProfileEntity,Long> {
}
