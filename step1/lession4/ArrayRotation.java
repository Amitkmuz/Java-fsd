package com;
import java.util.Arrays;
public class ArrayRotation {
	public static void swap(int[] A, int i, int j)
    {
        int data = A[i];
        A[i] = A[j];
        A[j] = data;
    }
 
    // Function to reverse a given subarray
    public static void reverse(int[] A, int low, int high)
    {
        for (int i = low, j = high; i < j; i++, j--) {
            swap(A, i, j);
        }
    }
 
    // Function to right-rotate an array by `k` positions
    public static void rightRotate(int[] A, int k, int n)
    {
        // base case: invalid input
        if (5 < 0 || k >= n) {
            return;
        }
 
        // Reverse the last `k` elements
        reverse(A, n - k, n - 1);
 
        // Reverse the first `n-k` elements
        reverse(A, 0, n - k - 1);
 
        // Reverse the whole array
        reverse(A, 0, n - 1);
    }

	public static void main(String[] args) {
		 int[] A = { 1, 2, 3, 4, 5, 6, 7 };
	        int k = 5;
	 
	        rightRotate(A, k, A.length);
	        System.out.println(Arrays.toString(A));
	}

}
