package com.kiran.service;

import java.util.List;

import com.kiran.entity.Feedback;
import com.kiran.entity.Notes;
import com.kiran.entity.Ticket;



public interface TicketService {

	String save(Ticket ticket);

	List<Ticket> getAllTickets();

	List<Ticket> getTicketsByCustomerId(Long id);

	Ticket getTicketById(Long id);

	List<Notes> getNotesByTicketId(Long id);

	String saveNotes(Notes notes);
	
	String saveFeedback(Feedback feedback);
	
	Feedback findFeedbackByTicket(Long id);
	
} 