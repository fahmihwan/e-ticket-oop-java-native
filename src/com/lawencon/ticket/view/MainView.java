package com.lawencon.ticket.view;

import static com.lawencon.ticket.util.ScannerUtil.scannerInt;

import java.util.ArrayList;
import java.util.List;

import com.lawencon.ticket.service.BusService;
import com.lawencon.ticket.service.PlaneService;
import com.lawencon.ticket.service.TrainService;
import com.lawencon.ticket.service.impl.BusServiceImpl;
import com.lawencon.ticket.service.impl.PlaneServiceImpl;
import com.lawencon.ticket.service.impl.TrainServiceImpl;
import com.lawencon.ticket.model.History;

public class MainView {

	public final List<History> listHistory = new ArrayList<History>();

	public void showMain() {
		System.out.println("== Ticket Booking ==");
		System.out.println("1. Jadwal Keberangkatan.");
		System.out.println("2. History.");
		System.out.println("3. Keluar Aplikasi.");

		final int choice = scannerInt("Pilih Menu: ", 3);
		if (choice == 1) {
			final BusService busService = new BusServiceImpl();
			final TrainService trainService = new TrainServiceImpl();
			final PlaneService planeService = new PlaneServiceImpl();
			
			final BookingView booking = new BookingView(busService, trainService, planeService, this);
			booking.setHistories(listHistory);
			booking.menuTransport();
		} else if (choice == 2) {
			final HistoryView history = new HistoryView();
			history.showHistory(listHistory);
		}

	}
}
