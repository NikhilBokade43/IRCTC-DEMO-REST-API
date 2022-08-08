package com.nikhil.service;

import com.nikhil.binding.Passenger;
import com.nikhil.binding.Ticket;

public interface Ticet_Booking_Interface {
	
	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(String ticketNum);

}
