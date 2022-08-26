package com.kiran.dto;

import java.util.Set;

import com.kiran.entity.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDto {
	
	
	private Long id;	
	private User user;
	private Set<String> serviceType;
	private String address;
	private String zipcode;

	
}