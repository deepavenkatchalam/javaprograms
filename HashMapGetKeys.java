package com.intma;

import java.util.HashMap;
import java.util.Set;

public class HashMapGetKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<String, String> hm = new HashMap<String, String>();
	        hm.put("first", "FIRST INSERTED");
	        hm.put("second", "SECOND INSERTED");
	        hm.put("third","THIRD INSERTED");
	        System.out.println(hm);
	        Set<String> keys = hm.keySet();
	        for(String key: keys){
	            System.out.println(key);
		

	}

	}
}
