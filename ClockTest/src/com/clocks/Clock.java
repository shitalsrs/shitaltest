package com.clocks;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Clock {

	public static void main(String[] args){
	
	/*DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
	LocalDateTime now = LocalDateTime.now();
	String s=dtf.format(now)+"";*/
		
		String s="13:19:43";
	String[] titem = s.split(":");
	System.out.println("Current time -"+s);
	String second=seconds(Integer.parseInt(titem[2]));
	System.out.println("Display second-"+second);
	System.out.println("Display top hours lights-"+topHours(Integer.parseInt(titem[0])));
	System.out.println("Display bottom hours lights-"+bottomHours(Integer.parseInt(titem[0])));
	System.out.println("Display top Minutes lights-"+topMinutes(Integer.parseInt(titem[1])));
	System.out.println("Display bottom minutes lights-"+bottomMinutes(Integer.parseInt(titem[1])));
	
	
}

	public static String seconds(int titem) {
			if (titem % 2 == 0) 
				return "Yellow";
        else return "Orange";
    }

	public static String topHours(int cHr) {
        return displayStatus(4, topOnSignal(cHr));
    }

	public static String bottomHours(int cHr) {
        return displayStatus(4, cHr % 5);
    }
  
	public static String topMinutes(int cTopMin) {
        return displayStatus(11, topOnSignal(cTopMin), "Yellow").replaceAll("YellowYellowYellow", "YellowYellowRed");
    }
  
	public static String bottomMinutes(int cBottomMin) {
        return displayStatus(4, cBottomMin % 5, "Yellow");
    }

	public static String displayStatus(int light, int onNumberSignal) {
        return displayStatus(light, onNumberSignal, "Red");
    }
	public  static String displayStatus(int light, int onNumberSignal, String onSign) {
        String getoutput = "";
        
        for (int i = 0; i < onNumberSignal; i++) {
        	getoutput += onSign;
        }
        for (int j = 0; j < (light - onNumberSignal); j++) {
        	getoutput += "Orange";
        }
        return getoutput;
    }

     static int topOnSignal(int HrMin) {
    	
    	int hrMinMod=HrMin % 5;
        return (HrMin -hrMinMod ) / 5;
    }

}
