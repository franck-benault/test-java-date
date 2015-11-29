package net.franckbenault.testjavadate;

import static org.junit.Assert.*;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class LocalDateTestCase {

	@Test
	public void test01Creation() {
		
		LocalDate date = LocalDate.of(2015, Month.JUNE, 23);
		assertNotNull(date);
	}
	
	@Test(expected=DateTimeException.class)
	public void test02CreationInvalideDay() {
		
		LocalDate.of(2015, Month.JUNE, 36);

	}

}
