package com.example.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.example.demo.model.User;
import com.example.demo.reposistory.Userrepo;
import com.example.demo.service.SequenceGeneratorService;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

	@Autowired
	private Userrepo repository;
	
	@Autowired
	private SequenceGeneratorService sequenceGeneratorService;
	
	@Autowired
	private UserService userservice;
	
	@PostMapping("/add")
	public String saveUser(@RequestBody User user) {
		//set Id
//	  int status = userservice.isUserExist(user.getEmail());
//System.out.print("int"+status);
		int a=0;
		try{
			userservice.findByEmail(user.getEmail());
		}
		catch(NoSuchElementException e) {
			a=1;
			
		}
		if(a==1) {
		user.setId(sequenceGeneratorService.generateSequence(User.SEQUENCE_NAME));
	repository.save(user);
		}
		else {
		return "false";	
			}
		return "true";
		
	}
	@GetMapping("/getAll")
	public List<User> getUser() {
		
		return userservice.getAllUsers();
		
	}
	@PostMapping("/check")
	public String check(@RequestBody User user) {
		//System.out.println(user);
		User value = userservice.findByEmail(user.getEmail());
		//System.out.println("value"+value);
		
		if((value.getPassword().compareTo(user.getPassword()))==0) {
		//	System.out.println("true");
			return "true";
		}
		return  "false";
	}
	@GetMapping("/users/{email}")
	public User getUser(@PathVariable String email){
		//System.out.print("email");
		 User user = userservice.findByEmail(email);
		return user;
	}
	 @GetMapping("/user/{id}")
	  public User getUserById(@PathVariable Integer id){
		// System.out.print(id);
	    return userservice.getUserById(id);
	  }
	 @RequestMapping("/gg")
	 public RedirectView ched() {
		 
		 return new RedirectView("/add");
	 }
}
