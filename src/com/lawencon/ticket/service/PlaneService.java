package com.lawencon.ticket.service;

import java.util.List;
import com.lawencon.ticket.model.Schedule;
import com.lawencon.ticket.model.Chair;

public interface PlaneService {
	
	List<Schedule> findPlaneSchedule();
	
	List<Chair> findPlaneChair(int input);
}
