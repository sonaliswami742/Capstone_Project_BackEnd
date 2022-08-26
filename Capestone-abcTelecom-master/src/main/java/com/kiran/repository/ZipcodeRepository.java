package com.kiran.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.kiran.entity.Zipcode;



@CrossOrigin

public interface ZipcodeRepository extends JpaRepository<Zipcode, Long> {

}
