package com.tactfactory.tp2.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tactfactory.tp2.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

//	Object findByRolesIn(User user);

	
}

