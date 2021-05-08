package com.tactfactory.tp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tactfactory.tp2.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}