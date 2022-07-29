package com;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num[]= {5,2,1,8,6,3,4};
        System.out.println("Before sort");
        for(int n:num) {
        	System.out.print(" "+n);
        	
        }
        Arrays.sort(num);
        System.out.println();
        System.out.println("After sort-Asc");
        for(int n:num) {
        	System.out.println(" "+n);
        }
        System.out.println();
       // Arrays.sort(num,Collections.reverseOrder());
       // System.out.println("After sort-Desc");
        //for(int n:num) {
       // 	System.out.print(" "+n);
      //  }
        System.out.println();
        System.out.println("search" +Arrays.binarySearch(num, 2));
        System.out.println("search"+Arrays.binarySearch(num, 8));
        System.out.println("search"+Arrays.binarySearch(num, 10));
	}

}
