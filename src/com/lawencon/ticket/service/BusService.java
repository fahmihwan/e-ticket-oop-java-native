package com.lawencon.ticket.service;

import java.util.List;
import com.lawencon.ticket.model.Schedule;
import com.lawencon.ticket.model.Chair;

public interface BusService {
	
	List<Schedule> findBusSchedule();
	
	List<Chair> findBusChair(int input);
}
