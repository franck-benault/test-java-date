package net.franckbenault.testjavadate;

import static org.junit.Assert.*;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

import org.junit.Test;

public class LocalDateTimeTestCase {

	@Test
	public void test01Creation() {
		LocalDateTime dateTime = LocalDateTime.of(2014, Month.JUNE, 20,21, 50);
		assertNotNull(dateTime);
		assertEquals(dateTime.getHour(),21);
	}

	@Test
	public void test01bCreationNow() {
		LocalDateTime dateTime = LocalDateTime.now();
		assertNotNull(dateTime);
		
	}
	
	@Test
	public void test01bCreationFromDateTime() {
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		
		LocalDateTime dateTime = LocalDateTime.of(date,time);
		assertNotNull(dateTime);
		
	}
	
	
	
	@Test(expected=DateTimeException.class)
	public void test02CreationInvalideHour() {
		
		LocalDateTime.of(2014, Month.JUNE, 20,25, 50);
		

	}
	
	@Test(expected=DateTimeException.class)
	public void test02bCreationInvalideMinute() {
		
		LocalDateTime.of(2014, Month.JUNE, 20,23, 70);

	}
	
	
}
