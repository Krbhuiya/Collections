package com.capgemini.lab6.exercise1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.List;

public class StudentGrading {
	public static HashMap<String,String> getStudents(HashMap<String,Integer> hm){
		int len = hm.size();
		HashMap<String,String> hm1 = new HashMap<String,String>();
		List<String> ar2 = new ArrayList<String>(hm.keySet());
		List<Integer> ar1 = new ArrayList<Integer>(hm.values());
		for(int i = 0 ; i < len ; i++) {
			if(ar1.get(i) >= 90)
				hm1.put(ar2.get(i), "Gold");
			else if(ar1.get(i) >= 80 && ar1.get(i) < 90)
				hm1.put(ar2.get(i), "Silver");
			else if(ar1.get(i) >= 70 && ar1.get(i) < 80)
				hm1.put(ar2.get(i), "Bronze");
		}
		return hm1;
	}  
	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int limit = sc.nextInt();
		for(int i = 0 ; i < limit ; i++) {
			System.out.println("Registration No.: ");
			String str = sc.next();
			System.out.println("Marks: ");
			int marks = sc.nextInt();
			hm.put(str, marks);
		}
		System.out.println("Eligible student list: ");
		System.out.println(getStudents(hm));
		sc.close();
	}

}