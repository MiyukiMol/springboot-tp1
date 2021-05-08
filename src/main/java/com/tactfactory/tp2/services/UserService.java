package com.tactfactory.tp2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tactfactory.tp2.repository.UserRepository;
import com.tactfactory.tp2.entities.User;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return this.repository.findAll();
	}
	
	public void generateUsers(final Integer nb) {
		for (int i = 0; i < nb; i++) {
			User user =new User();
			user.setFirstname("fname" + i);
			user.setLastname("fname" + i);
			
			this.repository.save(user);
		}
	}
}
