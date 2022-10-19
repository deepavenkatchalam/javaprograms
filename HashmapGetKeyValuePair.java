package com.intma;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapGetKeyValuePair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);

        Set<Entry<String, String>> entires = hm.entrySet();
        for(Entry<String,String> ent:entires){
            System.out.println(ent.getKey()+" ==> "+ent.getValue());
        }

	}

}
