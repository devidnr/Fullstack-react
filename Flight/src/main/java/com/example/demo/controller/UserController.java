package com.example.demo.controller;

import java.util.List;

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
import com.example.demo.service.SequenceGeneratorService;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
	@Autowired
	private UserService userservice;
	
	@Autowired
	private SequenceGeneratorService service;
	
	@PostMapping("/add")
	public String add(@RequestBody User user) {
		user.setId(service.generateSequence(User.SEQUENCE_NAME));
	//	System.out.print(user.getId(service.generateSequence(User.SEQUENCE_NAME)));
		userservice.saveUser(user);
		return "user in mongo added";
		
	}
	@GetMapping("/getAll")
	public List<User> getAllUsers(){
		return userservice.getAllUsers();
	}
	@PostMapping("/check")
	public String check(@RequestBody User user) {
		System.out.println(user);
		User value = userservice.findByEmail(user.getEmail());
		System.out.println("value"+value);
		
		if((value.getPassword().compareTo(user.getPassword()))==0) {
			System.out.println("true");
			return "true";
		}
		return  "false";
	}
	@GetMapping("/users/{email}")
	public User getUser(@PathVariable String email){
		System.out.print("email");
		 User user = userservice.findByEmail(email);
		return user;
	}
	 @GetMapping("/user/{id}")
	  public User getUserById(@PathVariable Integer id){
		 System.out.print(id);
	    return userservice.getUserById(id);
	  }
	 @RequestMapping("/gg")
	 public RedirectView ched() {
		 System.out.print(false);  
		 return new RedirectView("/add");
	 }
	 

}
