package com.example.APIGateway.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.APIGateway.model.UserRoleEntity;


public interface RoleRepository extends JpaRepository<UserRoleEntity,Long> {
}
