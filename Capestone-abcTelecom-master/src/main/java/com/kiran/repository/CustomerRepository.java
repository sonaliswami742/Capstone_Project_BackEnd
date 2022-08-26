package com.kiran.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kiran.entity.Customer;
import com.kiran.entity.User;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	List<Customer> findByUser(User user);

}
