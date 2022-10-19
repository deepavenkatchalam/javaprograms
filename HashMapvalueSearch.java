package com.intma;

import java.util.HashMap;

public class HashMapvalueSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        HashMap<String, String> hm = new HashMap<String, String>();
      
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        if(hm.containsValue("SECOND INSERTED")){
            System.out.println("The hashmap contains value SECOND INSERTED");
        } else {
            System.out.println("The hashmap does not contains value SECOND INSERTED");
        }
        if(hm.containsValue("first")){
            System.out.println("The hashmap contains value first");
        } else {
            System.out.println("The hashmap does not contains value first");
        }

	}

}
