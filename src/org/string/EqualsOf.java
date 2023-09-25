package org.string;

import java.util.Scanner;

public class EqualsOf {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the String1:");
		String str1=s.nextLine();
		System.out.println("Enter the String2:");
		String str2=s.nextLine();
		boolean equals = str1.equals(str2);
		if(equals==true) {
			System.out.println("The strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
	}

}
