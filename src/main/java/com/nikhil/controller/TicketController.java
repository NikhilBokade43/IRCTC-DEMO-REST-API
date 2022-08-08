package com.nikhil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.nikhil.binding.Passenger;
import com.nikhil.binding.Ticket;
import com.nikhil.service.Ticet_Booking_Interface;

@Controller
public class TicketController {
	
	@Autowired
	private Ticet_Booking_Interface service;
	
	@PostMapping(value = "/bookticket", consumes = {"application/json"}, 
			produces = {"application/json"})
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger){
		
		Ticket t = service.bookTicket(passenger);
		
		return new ResponseEntity<Ticket>(t, HttpStatus.CREATED);
	}
	
	@GetMapping("/getTicket/{ticketNum}")
	public ResponseEntity<Ticket> getTicket(@PathVariable String ticketNum){
		
		Ticket t = service.getTicket(ticketNum);
		return new ResponseEntity<>(t, HttpStatus.OK);
	}
	

}
