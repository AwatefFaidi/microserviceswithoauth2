package com.example.APIGateway.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
import com.example.APIGateway.model.UserRoleEntity;
import com.example.APIGateway.repository.RoleRepository;
import com.example.APIGateway.constraint.*;


@Component
public class AppRunner implements CommandLineRunner {

    @Autowired private RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        //Initially All will be delete when server startup
        roleRepository.deleteAll();
        roleRepository.save(new UserRoleEntity(null,"ROLE_ADMIN", UserStatus.ACTIVE.getStatus(), LocalDateTime.now()));
        roleRepository.save(new UserRoleEntity(null,"ROLE_USER", UserStatus.ACTIVE.getStatus(), LocalDateTime.now()));
       roleRepository.save(new UserRoleEntity(null,"ROLE_PATIENT", UserStatus.ACTIVE.getStatus(), LocalDateTime.now()));
        System.out.println("Role insert successfully.");
    }
}