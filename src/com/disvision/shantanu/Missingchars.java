package com.disvision.shantanu;

import java.util.Scanner;

public class Missingchars {

	public static void main(String[] args) {
		int count=0;
		try {
		System.out.println("Enter any string");
		Scanner scanner= new Scanner(System.in);
		String s = scanner.nextLine();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			//count=0;
			if(ch==65) {
			count++;	
			}
		}System.out.println(count);
		scanner.close();

	}catch(Exception e) {
		System.out.println(e);
	}
		}

}
