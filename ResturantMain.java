package com.technoelevate.resturantproject;

import java.util.*;
import java.util.Map.Entry;

public class ResturantMain {
	static String items[] = {"Chicken Biryani","Noodles","Pizza","Paneer","Manchurian","Sandwich"};
	static int price[] = {150,50,200,120,100,60};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Items");
		for(int j=0;j<35;j++) {
			System.out.print(" ");
		}
		System.out.println("Price");
		for(int i=0;i<50;i++) {
			System.out.print("-");
		}
		System.out.println();
		for (int i = 0; i < price.length; i++) {
			System.out.print((i+1)+"."+items[i]);
			for(int j=0;j<40-(items[i].length());j++) {
				System.out.print(" ");
			}
			System.out.print(price[i]);
			System.out.println();
		}
		boolean input = true;
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		while(input==true) {
			System.out.println("Please Select item no. to order");
			Set<Entry<String,Integer>> set = choose().entrySet();
			for (Entry<String, Integer> entry : set) {
				hm.put(entry.getKey(), entry.getValue());
			}
			System.out.println("Do you want to add more items?Y/N");
			String decision = sc.next();
			if(decision.equalsIgnoreCase("y")) {
				input=true;
			}
			else {
				input=false;
			}
		}
		
		System.out.println("Your order details");
		Set<Entry<String,Integer>> set = hm.entrySet();
		for (Entry<String, Integer> entry : set) {
			System.out.print(entry.getKey());
			for(int i=0;i<40-(entry.getKey().length());i++) {
				System.out.print(" ");
			}
			System.out.print(entry.getValue());
			System.out.println();
		}
		billing(hm);
		
	}
	static HashMap<String,Integer> choose() {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the item no. :");
		int n = sc.nextInt();
		if(n>items.length) {
			System.out.println("Please enter valid number");
			choose();
		}
		else
			hm.put(items[n-1], price[n-1]);
		return hm;
	}
	static void billing(HashMap<String,Integer> hm) {
		int total=0;
		Set<Entry<String,Integer>> set = hm.entrySet();
		for (Entry<String, Integer> entry : set) {
			total+=entry.getValue();
		}
		System.out.println("Total Amount = "+total);
		System.out.println("Order Placed Successfully");
	}
	
	
}
