package com.technoelevate.jobportal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class JobPortalMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Candidate> set = new HashSet<Candidate>();
		set = register();
		List<Candidate> lst = new ArrayList<Candidate>();
		lst = selection(set);
		System.out.println("The List of Selected Students");
		for (Candidate candidate : lst) {
			System.out.print(candidate.name);
			for(int i=0;i<35-(candidate.name).length();i++) {
				System.out.print(" ");
			}
			System.out.println(candidate.mob);
		}
	}
	
	
	static List<Candidate> selection(Set<Candidate> set) {
		List<Candidate> lst = new ArrayList<Candidate>();
		for (Candidate candidate : set) {
			if(candidate.per>=60.0)
				lst.add(candidate);
		}
		return lst;
	}
	
	
	static Set<Candidate> register() {
		Scanner sc = new Scanner(System.in);
		Set<Candidate> set = new HashSet<Candidate>();
		
		System.out.println("Enter the Candidates");
		while(true) {
			boolean isDuplicate = false;
			System.out.print("Enter the name ");
			String name = sc.nextLine();
			System.out.print("Enter Mobile ");
			long mob = sc.nextLong();
			System.out.print("Enter Percentage ");
			double per = sc.nextDouble();
			for (Candidate candidate : set) {
				if(candidate.mob==mob) {
					isDuplicate=true;
					System.err.println("Duplicate Values Are not Allowed");
					break;
				}
			}
			if(!isDuplicate)
				set.add(new Candidate(name, mob, per));
			System.out.println();
			System.out.println("Do you want to add more?Y/N");
			String ans = sc.next();
			sc.nextLine();
			if(ans.equalsIgnoreCase("Y"))
				continue;
			else
				break;
		}
		return set;
	}
}
