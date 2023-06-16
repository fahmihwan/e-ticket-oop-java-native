package com.lawencon.ticket.util;

import java.util.Scanner;

public class ScannerUtil {
	
	//Scanner untuk String
	public static String scannerString(String value) {
		final Scanner scan = new Scanner(System.in);
		
		System.out.print(value);
		String trimmedInput = "";
		
		try {
			String input = scan.nextLine();
			trimmedInput = input.trim();
			if(trimmedInput.equals("")) {
				return scannerString("Inputan Anda salah. Masukkan lagi: ");
			}
		} catch (Exception e) {
			System.out.println("Input yang anda masukkan salah: ");
			e.printStackTrace();
		}

		return trimmedInput;
	}
	
	public static int scannerInt(String value, int range) {
		final Scanner scan = new Scanner(System.in);
		
		System.out.print(value);
		int option = 0;
		final String input = scan.nextLine().trim();
		
		try {
			
			if (input.equals("")) {
				return scannerInt("Inputan Anda salah. Masukkan lagi: ", range);
			}
			
			option = Integer.parseInt(input);
			
			if (range > 0 && (option < 1 || option > range)) {
				return option = scannerInt("Inputan Anda salah. Masukkan lagi: ", range);
			} else if (option < 0 || option == 0) {
				return option = scannerInt("Inputan Anda salah. Masukkan lagi: ", range);
			}
		}catch(Exception e){
			e.printStackTrace();
			return scannerInt("Inputan Anda salah. Masukkan lagi: ", range);
		}
		
		return option;
	}
	
	//Scanner untuk Double
		public static double scannerDouble(String value, int range) {
			final Scanner scan = new Scanner(System.in);
			
			System.out.print(value);
			double option = 0;
			final String input = scan.nextLine().trim();
			
			try {
				
				if (input.equals("")) {
					return scannerDouble("Inputan Anda salah. Masukkan lagi: ", range);
				}
				
				option = Double.parseDouble(input);
				
				if (range > 0 && (option < 1 || option > range)) {
					return option = scannerDouble("Inputan Anda salah. Masukkan lagi: ", range);
				} else if (option < 0 || option == 0) {
					return option = scannerDouble("Inputan Anda salah. Masukkan lagi: ", range);
				}
			}catch(Exception e){
				e.printStackTrace();
				return scannerDouble("Inputan Anda salah. Masukkan lagi: ", range);
			}
			
			return option;
		}	
}
