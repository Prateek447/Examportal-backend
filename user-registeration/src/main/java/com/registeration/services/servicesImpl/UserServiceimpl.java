package com.registeration.services.servicesImpl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registeration.entities.User;
import com.registeration.entities.UserRole;
import com.registeration.repositories.RoleRepository;
import com.registeration.repositories.UserRepository;
import com.registeration.services.UserService;


@Service
public class UserServiceimpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private RoleRepository roleRepo;

	@Override
	public User createUser(User user, Set<UserRole> roles) throws Exception {
		
		User local = this.userRepo.findByUsername(user.getUsername());
		if(local != null) {
			System.out.println("User is already there");
			throw new Exception("user is already present !");
		}
		else {
			for(UserRole ur: roles) {
				roleRepo.save(ur.getRole());
			}
			user.getRoles().addAll(roles);
		   local  = 	this.userRepo.save(user);
		}
		
		return local;
	}

	@Override
	public User getUser(String username) {
		return this.userRepo.findByUsername(username);
	}

	@Override
	public void deleteUser(Long id) {
	 this.userRepo.deleteById(id);
		
	}

	@Override
	public User updateUser(User user) {
		return this.userRepo.save(user);
	}

}
