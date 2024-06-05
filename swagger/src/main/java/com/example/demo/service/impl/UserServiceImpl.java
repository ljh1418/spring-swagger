package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
	
	private final UserMapper UserMapper;

	@Override
	public User userSelect(String id) {
		return UserMapper.userSelect(id);
	}

	@Override
	public List<User> userList() {
		return UserMapper.usetList();
	}

}
