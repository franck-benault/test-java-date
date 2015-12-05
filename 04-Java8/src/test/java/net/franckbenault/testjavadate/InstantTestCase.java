package net.franckbenault.testjavadate;

import static org.junit.Assert.*;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class InstantTestCase {

	@Test
	public void test() throws InterruptedException {
		//time for a host 
		//then it is possible to compare instant
		Instant start = Instant.now();
		
		//sleep a little
		TimeUnit.MILLISECONDS.sleep(1);
		
		Instant end = Instant.now();
		
		//compare two instants
		assertTrue(end.isAfter(start));
		assertFalse(end.isBefore(start));
		
	}

}
