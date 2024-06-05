package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.User;


public interface UserService {
	User userSelect(String id);

	List<User> userList();
}
