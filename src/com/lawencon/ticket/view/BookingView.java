package com.lawencon.ticket.view;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.lawencon.ticket.constant.VoucherConstant;
import com.lawencon.ticket.model.Chair;
import com.lawencon.ticket.model.History;
import com.lawencon.ticket.model.Order;
import com.lawencon.ticket.model.Schedule;
import com.lawencon.ticket.service.BusService;
import com.lawencon.ticket.service.PlaneService;
import com.lawencon.ticket.service.TrainService;

import static com.lawencon.ticket.util.ScannerUtil.scannerInt;
import static com.lawencon.ticket.util.ScannerUtil.scannerString;
import static com.lawencon.ticket.util.GenerateUtil.generateRandomCode;

public class BookingView {

	private final BusService busService;
	private final TrainService trainService;
	private final PlaneService planeService;
	final List<Order> orders = new ArrayList<>();
	
	//history
	private final MainView mainView;
	private List<History> histories;

	BookingView(BusService busService, TrainService trainService, PlaneService planeService, MainView mainView) {
		this.busService = busService;
		this.trainService = trainService;
		this.planeService = planeService;
		this.mainView = mainView;
	}
	
	void setHistories(List<History> histories) {
		this.histories = histories;
	}

	void menuTransport() {
		System.out.println("=== Pilih Transportasi ===");
		System.out.println("1. Bus. ");
		System.out.println("2. Kereta. ");
		System.out.println("3. Pesawat. ");
		final int choice = scannerInt("Masukkan pilihan ", 3);

		if (choice == 1) {
			showBus();
		} else if (choice == 2) {
			showTrain();
		} else if (choice == 3) {
			showPlane();
		}
	}

	private void showBus() {
		System.out.println("== Menu Booking Ticket Bus ==");

		final List<Schedule> listSchedule = busService.findBusSchedule();

		for (int i = 0; i < listSchedule.size(); i++) {
			final Schedule schedule = listSchedule.get(i);
			System.out.println(i + 1 + ". " + schedule.getName() + " - " + schedule.getDate() + " - "
					+ schedule.getFrom() + " - " + schedule.getTo() + " - " + schedule.getPrice());
		}

		final int choice = scannerInt("Pilih Jadwal ", listSchedule.size());
		final Schedule choiceSchedule = listSchedule.get(choice - 1);

		final List<Chair> listChair = busService.findBusChair(choiceSchedule.getScheduleId());

		for (int i = 0; i < listChair.size(); i++) {
			final Chair readyChair = listChair.get(i);
			System.out.println(i + 1 + ". " + readyChair.getCode());
		}

		final int option = scannerInt("Pilih kursi: ", listChair.size());

		final Chair choiceChair = listChair.get(option - 1);
		final String code = choiceChair.getCode();

		final int price = choiceSchedule.getPrice();
		final String from = choiceSchedule.getFrom();
		final String to = choiceSchedule.getTo();
		final String date = choiceSchedule.getDate();
		final String transport = "Bus";
		final String dateNow = setDate(); 

		inputOrder(code, from, to, date, price, transport, dateNow);

		System.out.println("Apakah Anda ingin memesan tiket lagi?");
		System.out.println("1. Ya.");
		System.out.println("2. Tidak.");
		final int options = scannerInt("Pilih opsi: ", 2);

		if (options == 1) {
			menuTransport();
		} else if (options == 2) {
			checkout();
		}
	}

	private void showTrain() {
		System.out.println("== Menu Booking Ticket Kereta ==");

		final List<Schedule> listSchedule = trainService.findTrainSchedule();

		for (int i = 0; i < listSchedule.size(); i++) {
			final Schedule schedule = listSchedule.get(i);
			System.out.println(i + 1 + ". " + schedule.getName() + " - " + schedule.getDate() + " - "
					+ schedule.getFrom() + " - " + schedule.getTo() + " - " + schedule.getPrice());
		}

		final int choice = scannerInt("Pilih Jadwal ", listSchedule.size());
		final Schedule choiceSchedule = listSchedule.get(choice - 1);

		final List<Chair> listChair = trainService.findTrainChair(choiceSchedule.getScheduleId());

		for (int i = 0; i < listChair.size(); i++) {
			final Chair readyChair = listChair.get(i);
			System.out.println(i + 1 + ". " + readyChair.getCode());
		}

		final int option = scannerInt("Pilih kursi: ", listChair.size());

		final Chair choiceChair = listChair.get(option - 1);
		final String code = choiceChair.getCode();

		final int price = choiceSchedule.getPrice();
		final String from = choiceSchedule.getFrom();
		final String to = choiceSchedule.getTo();
		final String date = choiceSchedule.getDate();
		final String transport = "Train";
		final String dateNow = setDate();

		inputOrder(code, from, to, date, price, transport, dateNow);

		System.out.println("Apakah Anda ingin memesan tiket lagi?");
		System.out.println("1. Ya.");
		System.out.println("2. Tidak.");
		final int options = scannerInt("Pilih opsi: ", 2);

		if (options == 1) {
			menuTransport();
		} else if (options == 2) {
			checkout();
		}
	}

	private void showPlane() {
		System.out.println("== Menu Booking Ticket Pesawat ==");

		final List<Schedule> listSchedule = planeService.findPlaneSchedule();

		for (int i = 0; i < listSchedule.size(); i++) {
			final Schedule schedule = listSchedule.get(i);
			System.out.println(i + 1 + ". " + schedule.getName() + " - " + schedule.getDate() + " - "
					+ schedule.getFrom() + " - " + schedule.getTo() + " - " + schedule.getPrice());
		}

		final int choice = scannerInt("Pilih Jadwal ", listSchedule.size());
		final Schedule choiceSchedule = listSchedule.get(choice - 1);

		final List<Chair> listChair = planeService.findPlaneChair(choiceSchedule.getScheduleId());

		for (int i = 0; i < listChair.size(); i++) {
			final Chair readyChair = listChair.get(i);
			System.out.println(i + 1 + ". " + readyChair.getCode());
		}

		final int option = scannerInt("Pilih kursi: ", listChair.size());

		final Chair choiceChair = listChair.get(option - 1);
		final String code = choiceChair.getCode();

		final int price = choiceSchedule.getPrice();
		final String from = choiceSchedule.getFrom();
		final String to = choiceSchedule.getTo();
		final String date = choiceSchedule.getDate();
		final String transport = "Pesawat";
		final String dateNow = setDate();

		inputOrder(code, from, to, date, price, transport, dateNow);

		System.out.println("Apakah Anda ingin memesan tiket lagi?");
		System.out.println("1. Ya.");
		System.out.println("2. Tidak.");
		final int options = scannerInt("Pilih opsi: ", 2);

		if (options == 1) {
			menuTransport();
		} else if (options == 2) {
			checkout();
		}
	}

	private void inputOrder(String code, String from, String to, String date, int price, String transport, String dateNow) {

		final Order order = new Order();

		boolean valid = false;
		order.setChairNum(code);
		order.setDate(date);
		order.setFrom(from);
		order.setTo(to);
		order.setPrice(price);
		order.setTransport(transport);
		order.setDateNow(dateNow);

		if (orders.isEmpty()) {
			orders.add(order);
		} else {
			for (int i = 0; i < orders.size(); i++) {
				final Order checkOrder = orders.get(i);
				if (checkOrder.getDate().equals(date) && checkOrder.getTransport().equals(transport)) {
					valid = true;
				}
			}

			if (valid == false) {
				orders.add(order);
			} else {
				System.out.println("Order gagal, Anda telah memesan transportasi sama di hari yang sama");
			}
		}
	}

	private void checkout() {

		System.out.println("Masukkan Data Diri.");
		final String name = scannerString("Nama : ");
		final String idNumber = scannerString("No. KTP: ");

		System.out.println("Apakah anda memiliki kode voucher?");
		System.out.println("1. Ya.");
		System.out.println("2. Tidak.");
		final int choice = scannerInt("Pilih: ", 2);

		final VoucherConstant[] listVoucher = VoucherConstant.values();
		int voucher = 0;
		if (choice == 1) {
			final String code = scannerString("Masukkan kode voucher Anda: ");
			for (int i = 0; i < listVoucher.length; i++) {
				if (listVoucher[i].name.equalsIgnoreCase(code)) {
					voucher = listVoucher[i].price;
				}
			}
		}

		int total = 0;
		System.out.println("== DATA BOOKING TIKET ==");
		for (int i = 0; i < orders.size(); i++) {
			final Order choiceOrder = orders.get(i);
			System.out.println(i + 1 + ". " + choiceOrder.getDateNow() + " - "
											+ choiceOrder.getTransport() + " - " 
											+ choiceOrder.getDate() + " - "
											+ choiceOrder.getFrom() + " - " 
											+ choiceOrder.getTo() + " - " 
											+ choiceOrder.getPrice() + " - "
											+ choiceOrder.getChairNum());
			total = total + choiceOrder.getPrice();
			
		}

		final int grandTotal = total - voucher;
		final String invoice = generateRandomCode();
		
		final History history = new History();
		history.setTransactionId(invoice);
		history.setTotal(grandTotal);
		
		//history
		//mainView.listHistory.add(history);
		histories.add(history);
		
		System.out.println("== Data Pemesan ==");
		System.out.println("Nama : " + name);
		System.out.println("No. KTP : " + idNumber);
		System.out.println("Kode Voucheer: "+voucher);
		System.out.println("Total Pembayaran: " + grandTotal);
		
		mainView.showMain();
	}

	private String setDate() {
		final Date dateNow = new Date();
		final SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm a");
		final String dateNowStr = formatter.format(dateNow);

		return dateNowStr;
	}
}
