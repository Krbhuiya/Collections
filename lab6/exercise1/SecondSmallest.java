package com.capgemini.lab6.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SecondSmallest {
	public static int getSecondSmallest(int[] arr) {
		int len = arr.length;
		ArrayList<Integer> arl1 = new ArrayList<Integer>();
		for(int i = 0 ; i < len ; i++) {
			arl1.add(arr[i]);
		}
		Collections.sort(arl1);
		int temp = arl1.get(1);
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int limit = sc.nextInt();
		System.out.println("Enter the list elements: ");
		int[] arr = new int[limit];
		for(int i = 0 ; i < limit ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Second smallest element: ");
        System.out.println(getSecondSmallest(arr));
        sc.close();
	}

}