package com.project.onlinebanking.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.onlinebanking.security.Role;


public interface RoleDao extends CrudRepository<Role, Integer> {

    Role findByName(String name);
}