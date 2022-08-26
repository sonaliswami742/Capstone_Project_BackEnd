package com.kiran.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kiran.entity.Manager;
import com.kiran.entity.User;


public interface ManagerRepository extends JpaRepository<Manager, Long>{

	List<Manager> findByUser(User user);
}
