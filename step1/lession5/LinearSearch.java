package com;

public class LinearSearch {
	static int search(int arr[], int n, int x)
    {
        for (int i = 0; i < n; i++) {
           
            if (arr[i] == x)
                return i;
        }
 
        // return -1 if the element is not found
        return -1;
    }

	public static void main(String[] args) {
		
		int[] arr = { 9, 7, 1, 3, 2 };
        int n = arr.length;
         
        int x = 2;
 
        int index = search(arr, n, x);
        if (index == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element found at position " + index);
		

	}

}
