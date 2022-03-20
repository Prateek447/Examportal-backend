package com.registeration.services;

import java.util.Set;

import com.registeration.entities.User;
import com.registeration.entities.UserRole;

public interface UserService {

	public User createUser(User user, Set<UserRole> roles) throws Exception;
	
	public User getUser(String username);
	
	public void deleteUser(Long id);
	
	public User updateUser(User user);
}
