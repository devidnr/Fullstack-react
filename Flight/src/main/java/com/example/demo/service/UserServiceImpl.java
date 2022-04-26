package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.UserRepo;
import com.example.demo.model.User;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepo repo;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		
		return repo.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		
		return  repo.findAll();
	}

	

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return repo.findById(userId).get();
	}

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return repo.findByEmail(email).get();
	}

}
