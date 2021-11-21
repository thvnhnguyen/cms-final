package com.btec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.btec.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {
	UserEntity findOneByUsernameAndStatus(String username, int status);
}