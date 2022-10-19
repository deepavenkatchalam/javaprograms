package com.intma;

import java.util.HashMap;

public class EmpHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(101,"deepa");
		hm.put(102,"vino");
		hm.put(103,"shiv");
		hm.put(104,"pri");
		System.out.println(hm);
		System.out.println("Employee name="+hm.get(103));
		hm.remove(104);
		System.out.println(hm);
		
		
	}

}
