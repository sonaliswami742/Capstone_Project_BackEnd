package com.kiran.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kiran.entity.Engineer;
import com.kiran.entity.User;



public interface EngineerRepository extends JpaRepository<Engineer, Long>{

	List<Engineer> findByUser(User user);
	List<Engineer> findByZipcode(String zipcode);
}