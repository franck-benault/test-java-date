package net.franckbenault.testjavadate;

import static org.junit.Assert.*;

import java.time.LocalTime;

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
	
}
