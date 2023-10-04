package com.example.APIGateway.serviceImpl;



import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.APIGateway.model.UserRoleEntity;
import com.example.APIGateway.repository.RoleRepository;
import com.example.APIGateway.service.RoleService;

import java.util.List;


@Slf4j
@Service
public class RoleServiceImpl implements RoleService{

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<UserRoleEntity> getAllRoles() {
        LOGGER.info("getAllRoles method call...");
        return roleRepository.findAll();
    }
}
