package net.franckbenault.testjavadate;

import static org.junit.Assert.*;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

import org.junit.Test;

public class LocalDateTestCase {

	@Test
	public void test01Creation() {
		
		LocalDate date = LocalDate.of(2015, Month.JUNE, 23);
		assertNotNull(date);
		assertEquals(date.getYear(),2015);
	}

	@Test
	public void test01bCreationNow() {
		
		LocalDate date = LocalDate.now();
		assertNotNull(date);
	}
	
	@Test(expected=DateTimeException.class)
	public void test02CreationInvalideDay() {
		
		LocalDate.of(2015, Month.JUNE, 36);

	}
	
	@Test
	public void test03Plus() {
		
		LocalDate date = LocalDate.of(2015, Month.JUNE, 23);
		
		date = date.plusYears(1);
		assertEquals(date.getYear(),2016);
		
	}
	
	@Test
	public void test04Minus() {
		
		LocalDate date = LocalDate.of(2015, Month.JUNE, 23);
		
		date = date.minusDays(1);
		assertEquals(date.getDayOfMonth(),22);
		
	}
	
	@Test
	public void test05WithNextDay() {
		
		LocalDate date = LocalDate.of(2015, Month.JUNE, 23);
		date = date.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));

	}

}
