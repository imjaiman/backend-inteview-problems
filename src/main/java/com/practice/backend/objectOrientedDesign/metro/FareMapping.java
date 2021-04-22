package com.practice.backend.objectOrientedDesign.metro;

import java.util.HashMap;
import java.util.Map;

public class FareMapping {
	
	public static Map<String,Double> fareMap= new HashMap<String,Double>();
	
	static {
		
		fareMap.put("weekday", 7.0);
		fareMap.put("weekend", 5.5);
      
		 // In future More mapping could go here 
		
	}

}
