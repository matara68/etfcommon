package com.inova.etfcommon.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class InterestCalculationHelper {
	
	private InterestCalculationHelper() {
		
	}
	
	public static LocalDate getCurrentDate() {
		return LocalDate.now();
	}
	
	public static LocalDateTime getCurrentDateTime() {
		return LocalDateTime.now();
	}
	
	public static int getCurrentYear() {
		return LocalDateTime.now().getYear();
	}
	
	public static int getCurrentMonthValue() {
		return LocalDateTime.now().getMonthValue();
	}
	
	public static Month getCurrentMonth() {
		return LocalDateTime.now().getMonth();
	}
	
	public static int getCurrentDayOfMonth() {
		return LocalDateTime.now().getDayOfMonth();
	}
}
