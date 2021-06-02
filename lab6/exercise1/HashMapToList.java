package com.capgemini.lab6.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HashMapToList {
	
	public static List<Integer> getValues(HashMap<Integer, Integer>hm)
	{
		List<Integer> list = new ArrayList<Integer>();
		list = hm.values().stream().collect(Collectors.toList());
		Collections.sort(list);
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
		int n;
		System.out.println("Enter the number of element want to insert: ");
		n = sc.nextInt();
		System.out.println("Enter the numbers: ");
		for(int i=0; i<n; i++)
		{
			int val = sc.nextInt();
			hashmap.put(i, val);
		}
		List<Integer> list = getValues(hashmap);
		System.out.println("Sorted List: ");
		System.out.println(list);
		sc.close();
	}

}
