package com.example.demo.model;

import org.springframework.data.annotation.Transient;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class User {
	@Transient
    public static final String SEQUENCE_NAME = "users_sequence";

    @Id
    private int id;

    private String name;
    @Indexed(unique=true)
	private String email;
	private String mobile;
	private String password;

    public User() { }

    public User(String name, String email,String mobile,String password) {
        this.name = name;
        this.email = email;
        this.mobile=mobile;
        this.password=password;
    }

    public int getId() {
        return id;
    }

    public void setId(int l) {
        this.id = l;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", password="
				+ password + "]";
	}

	
	


    
}
