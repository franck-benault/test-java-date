package net.franckbenault.testjavadate;

import static org.junit.Assert.*;

import java.time.DateTimeException;
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
	
	@Test(expected=DateTimeException.class)
	public void test02CreationInvalideHour() {
		
		LocalDateTime.of(2014, Month.JUNE, 20,25, 50);
		

	}
	
	@Test(expected=DateTimeException.class)
	public void test02bCreationInvalideMinute() {
		
		LocalDateTime.of(2014, Month.JUNE, 20,23, 70);

	}
	
	@Test
	public void test03Plus() {
		
		LocalTime time = LocalTime.of(21, 50);		
		time = time.plusHours(4);
		assertEquals(time.getHour(),1);
		
	}
	
	@Test
	public void test04Minus() {
		
		LocalTime time = LocalTime.of(21, 50);	
		time = time.minusMinutes(4);
		assertEquals(time.getMinute(),46);
		
	}
	
	@Test
	public void test05With() {
		LocalTime time = LocalTime.of(21, 50);	
		time = time.withHour(5);
		assertEquals(time.getHour(),5);

	}

}
