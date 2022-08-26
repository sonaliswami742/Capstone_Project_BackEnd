package com.kiran.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kiran.entity.User;



public interface UserRepository extends JpaRepository<User, Long>{

	List<User> findByEmail(String email);
}
