package com.capgemini.lab6.exercise1;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharArrayToHashMap {

	public static Map<Character,Integer> countChars(char[] arr)
	{
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		int count_1[] = new int[256];
		for(int i=0; i<arr.length; i++)
		{
			map.put((char)arr[i],++count_1[arr[i]]);
		}
		return map;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of character: ");
		int n = sc.nextInt();
		char arr[] = new char[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.next().trim().charAt(0);
		}
		Map<Character,Integer> map = countChars(arr);
		System.out.println(map);
		sc.close();
	}

}
