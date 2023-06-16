package com.lawencon.ticket.service;

import java.util.List;

import com.lawencon.ticket.model.Chair;
import com.lawencon.ticket.model.Schedule;

public interface TrainService {

	List<Schedule> findTrainSchedule();

	List<Chair> findTrainChair(int choice);
}
