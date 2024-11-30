package com.quizz;

import java.util.Scanner;

public class MainClass {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		QuestionChecking qc=new QuestionChecking();
		Questions questions=new Questions();
		FrameOfQuizz frame=new FrameOfQuizz();
		frame.design();
		
		
		questions.one();
		int count=0;
		System.out.println("Enter the option here");
		System.out.println("=>");
		char ch1=sc.next().charAt(0);
		if (qc.checkig(ch1,0)) {
			count++;	
		}
		System.out.println("************");
		questions.two();
		System.out.println("Enter the option here");
		System.out.println("=>");
		char ch2=sc.next().charAt(0);
		if (qc.checkig(ch2,1)) {
			count++;	
		}
		System.out.println("************");
		questions.three();
		System.out.println("Enter the option here");
		System.out.println("=>");
		char ch3=sc.next().charAt(0);
		if (qc.checkig(ch3,2)) {
			count++;	
		}
		System.out.println("************");
		questions.four();
		System.out.println("Enter the option here");
		System.out.println("=>");
		char ch4=sc.next().charAt(0);
		if (qc.checkig(ch4,3)) {
			count++;	
		}
		System.out.println("************");
		questions.five();
		System.out.println("Enter the option here");
		System.out.println("=>");
		char ch5=sc.next().charAt(0);
		if (qc.checkig(ch5,4)) {
			count++;	
		}
		System.out.println("************");
		System.out.println("ur marks is "+count+" out of 5");
	}

}
