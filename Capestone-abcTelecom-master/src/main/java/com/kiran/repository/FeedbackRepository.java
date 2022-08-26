package com.kiran.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kiran.entity.Feedback;
import com.kiran.entity.Ticket;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

	
	List<Feedback> findByTicket(Ticket ticket);
	
}
