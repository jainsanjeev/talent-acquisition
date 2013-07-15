package com.yash.talentacquisition.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.talentacquisition.model.User;
import com.yash.talentacquisition.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public User getUserByEmail(String email) {
		return userRepository.findUserByEmail(email);
	}
}
