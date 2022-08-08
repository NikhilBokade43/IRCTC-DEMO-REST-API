package com.nikhil.service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.nikhil.binding.Passenger;
import com.nikhil.binding.Ticket;

@Service
public class TicketService implements Ticet_Booking_Interface {

	Map<String, Ticket> ticketsMap = new HashMap<String, Ticket>();
	
	@Override
	public Ticket bookTicket(Passenger passenger) {
		
		//unique Value generation UUID
		String id = UUID.randomUUID().toString().replace("-", "");
		
		Ticket t = new Ticket();
		t.setEmail(passenger.getEmail());
		t.setFrom(passenger.getFrom());
		t.setName(passenger.getName());
		t.setPrice(4520.25);
		t.setTicketNum(id);
		t.setTo(passenger.getTo());
		t.setTrainNo(12334l);
		
		ticketsMap.put(id, t);
		
		return t;
	}

	@Override
	public Ticket getTicket(String ticketNum) {
		Ticket ticket = ticketsMap.get(ticketNum);
		return ticket;
	}

}
