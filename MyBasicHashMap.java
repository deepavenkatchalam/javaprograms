package com.intma;

import java.util.HashMap;
import java.util.Map;

public class MyBasicHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> hm=new HashMap <String,String>();
		 hm.put("first", "FIRST INSERTED");
	        hm.put("second", "SECOND INSERTED");
	        hm.put("third","THIRD INSERTED");
	        System.out.println(hm);
	       
	        System.out.println("Value of second: "+hm.get("second"));
	        System.out.println("Is HashMap empty? "+hm.isEmpty());
	        hm.remove("third");
	        System.out.println(hm);
	        System.out.println("Size of the HashMap: "+hm.size());

		

	}

}
