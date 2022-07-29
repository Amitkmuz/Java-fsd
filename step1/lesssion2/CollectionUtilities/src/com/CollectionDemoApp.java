package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String>listOfStd=new ArrayList();
        listOfStd.add("Dinesh");
        listOfStd.add("Mahesh");
        listOfStd.add("Ajay");
        listOfStd.add("Vijay");
        listOfStd.add("Ram");
        listOfStd.add("Raju");
        System.out.println("Before sort");
        for(String name:listOfStd) {
        	System.out.print(name+"");
        }
        Collections.sort(listOfStd);
        System.out.println();
        System.out.print("After SOrt-asc");
        for(String name:listOfStd) {
        	System.out.print(name+"");
        }
        Collections.reverse(listOfStd);
        System.out.println();
        System.out.print("After SOrt-desc");
        for(String name:listOfStd) {
        	System.out.print(name+"");
        }
        System.out.println();
    	if(Collections.binarySearch(listOfStd,"Raju")>=0) {
    		System.out.println("Name present");
    	}else {
    		System.out.println("Name is not present");
    	}
        
	}

}
