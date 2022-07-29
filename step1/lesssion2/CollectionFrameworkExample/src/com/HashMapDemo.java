package com;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map mm=new HashMap();
		Map mm=new TreeMap();
		mm.put(2, "Ravi");
		mm.put(1,"Ramesh");
		mm.put(4,"lokesh");
		mm.put(3,"Ajay");
		System.out.println(mm);
		mm.put(2,"Dinesh");
		mm.put(6,"Ajay");
		System.out.println(mm);
		System.out.println(mm.get(1));
		System.out.println(mm.get(100));
		System.out.println(mm.containsKey(1));
		System.out.println(mm.containsValue("Dinesh"));

	}

}
