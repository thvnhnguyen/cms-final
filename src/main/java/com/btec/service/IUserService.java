package com.btec.service;

import java.util.Map;

import com.btec.dto.UserDTO;

public interface IUserService {
	UserDTO findOne(String username);
	Map<String, String> findAllTrainer();
}
