package com.capgemini.lab6.exercise1;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CheckVoters {
	public static List<Integer> votersList(HashMap<Integer,LocalDate> hm){
		List<Integer> l2 = new ArrayList<Integer>();
		Iterator<LocalDate> it = hm.values().iterator();
        LocalDate ld1 = LocalDate.now();
        List<Integer> s1 = new ArrayList<Integer>(hm.keySet());
        int i = 0;
        while(it.hasNext()) {
        	Period age = Period.between(it.next(), ld1);
            int years = age.getYears();
            if(years > 18) 
            	l2.add(s1.get(i));
            i++;
        }      
        return l2;
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of voter: ");
		int limit = sc.nextInt();
		
		HashMap<Integer,LocalDate> mp = new HashMap<Integer,LocalDate>();
		//SimpleDateFormat sdf= new SimpleDateFormat(pattern);
		for(int i = 0 ; i < limit ; i++) {
			
			System.out.println("Enter Voter Id: ");
			Integer id = sc.nextInt();
			
			System.out.println("Enter DOB(YYYY-MM-dd): ");
			String date = sc.next();
			
			LocalDate dt1 = LocalDate.parse(date);
			mp.put(id, dt1);
		}
		System.out.println("Eligible voter list: ");
		System.out.println(votersList(mp));
		sc.close();

	}

}