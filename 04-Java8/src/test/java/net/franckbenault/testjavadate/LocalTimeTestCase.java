package net.franckbenault.testjavadate;

import static org.junit.Assert.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

import org.junit.Test;

public class LocalTimeTestCase {

	@Test
	public void test01Creation() {
		LocalTime time = LocalTime.of(21, 50);
		assertNotNull(time);
		assertEquals(time.getHour(),21);
	}

	@Test
	public void test01bCreationNow() {
		LocalTime time = LocalTime.now();
		assertNotNull(time);
		
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
