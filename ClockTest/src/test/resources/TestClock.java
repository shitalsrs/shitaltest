package test.resources;



import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.Test;

import com.clocks.Clock;

public class TestClock {
  
	
	
	
	
	@Test
	public void TestClockSecond(){
		String message="Orange";	
		Clock clock=new Clock();		
		assertEquals(message,clock.seconds(43));
	}
	
	
	@Test
	public void TestClockTopHr(){
		String message="RedRedOrangeOrange";	
		Clock clock2=new Clock();		
		assertEquals(message,clock2.topHours(13));
	}
    
	@Test
	public void TestClockBottomHr(){
		String message="RedRedRedOrange";	
		Clock clock=new Clock();		
		assertEquals(message,clock.bottomHours(13));
	}
	
	@Test
	public void TestClockTopMin(){
		String message="YellowYellowRedOrangeOrangeOrangeOrangeOrangeOrangeOrangeOrange";	
		Clock clock=new Clock();		
		assertEquals(message,clock.topMinutes(19));
	}
	
	@Test
	public void TestClockbottomMin(){
		String message="YellowYellowYellowYellow";	
		Clock clock=new Clock();		
		assertEquals(message,clock.bottomMinutes(19));
	}

	  
}
