package com.kiran.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.kiran.entity.Customer;
import com.kiran.entity.Engineer;
import com.kiran.entity.Ticket;



@CrossOrigin
public interface TicketRepository extends JpaRepository<Ticket, Long>{
	

	List<Ticket> findByCustomer(Customer customer);
	List<Ticket> findByZipcode(String zipcode);
	List<Ticket> findByEngineer(Engineer engineer);
}
