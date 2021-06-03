package com.technoelevate.mcq;

import java.util.Scanner;

public class McqMain {
	public static void main(String[] args) {
		String a1="Which is the 1st element in periodic table?\n (a)Hydrogen\n (b)Boron\n (c)Iron\n (d)Lithium";
		String a2="Who is the Prime minister of india?\n (a)Manmohan Singh\n (b)Narendra Modi\n (c)Ramnath Kovind\n (d)Pranab Mukahrjee";
		String a3="Who is the CM of Bihar?\n (a)Lalu yadav\n (b)Tejasvi Yadav\n (c)Mamta Banarjee\n (d)Nitish Kumar";
		String a4="What is the Capital Of India?\n (a)New Delhi\n (b)Mumbai\n (c)KolKata\n (d)Banglore";
		String a5="What is the capital of Goa?\n (a)Chennai\n (b)Gurugram\n (c)Delhi\n (d)Panji";
		String a6="What is the capital of USA?\n (a)Texas\n (b)LasVegas\n (c)NewYork\n (d)WashingTon";
		String a7="What is the Capital of Bihar?\n (a)MuzzafarPur\n (b)Darbhanga\n (c)Patna\n (d)Vaishali";
		String a8="National Bird of India?\n (a)Eagle\n (b)Parrot\n (c)Sparrow\n (d)None of Above";
		String a9="Natinal game Of India?\n (a)Cricket\n (b)Hockey\n (c)Football\n (d)None of Above";
		String a10="Who is known as missile man of india?\n (a)Aryabhatt\n (b)Dr. Vashikaran\n (c)ShahRukh Khan\n (d)Dr. Abdul Kalam azad";
		String a11="Who wrote the national anthem of India?\n (a)Aryabhatt\n (b)Bipin Chandra Pal\n (c)PremChand\n (d)Kalidas";
		String a12="Who wrote the national anthem of BanglaDesh?\n (a)Aryabhatt\n (b)Bipin Chandra Pal\n (c)PremChand\n (d)Kalidas";
		String a13="Who was the first prime Minister of India?\n (a)Aryabhatt\n (b)Atal Vihari Vajpayee\n (c)Rajeev Gandhi\n (d)jawahar lal Nehru";
		String a14="Who was First President of India ?\n (a)Subhash Chandra bose\n (b)Mahatma gandhi\n (c)Rajendra Prasad\n (d)None of above";
		String a15="In which Year we got Independence?\n (a)1960\n (b)1947\n (c)1944\n (d)1857";


		Questions[] questions= {
				new Questions(a1,"a"),
				new Questions(a2,"b"),
				new Questions(a3,"d"),
				new Questions(a4,"a"),
				new Questions(a5,"d"),
				new Questions(a6,"c"),
				new Questions(a7,"c"),
				new Questions(a8,"d"),
				new Questions(a9,"b"),
				new Questions(a10,"d"),
				new Questions(a11,"a"),
				new Questions(a12,"a"),
				new Questions(a13,"d"),
				new Questions(a14,"c"),
				new Questions(a15,"b")
		};
		takeTest(questions);
	}
	public static void takeTest(Questions [] questions){
		int score =0;
		int skip = 0;
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < questions.length; i++) {
			System.out.println((i+1)+"."+questions[i].ques);
			System.out.println("write skip to move to next question");
			System.out.print("Ans: ");
			String answer=sc.next();
			if(answer.equalsIgnoreCase("skip")) {
				skip++;
				continue;
			}
			if (answer.equals(questions[i].ans)) {
				score++;
			}
		}
		System.out.println("Questions Attempted = "+(questions.length-skip));
		System.out.println("Correct Answers = "+score);
		double percentage = (score*100.0)/questions.length;
		System.out.println("You Scored "+percentage+"%");
		System.out.println("Remarks About Test");
		if(percentage>=95.0)
			System.out.println("Excellent "+"\nYou are eligible for next Round");
		else if(percentage>=80.0) 
			System.out.println("Very Good "+"\nYou are eligible for next Round");
		else if(percentage>=60)
			System.out.println("Good"+"\nYou are eligible for next Round");
		else
			System.out.println("Not Satisfactory"+"\nYou are not eligible for next Round");

	}
}
