package org.string;

import java.util.Scanner;

public class EqualsIgnoreCase {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the String1:");
		String str1=s.nextLine();
		System.out.println("Enter the String2:");
		String str2=s.nextLine();
		boolean equalsIgnoreCase = str1.equalsIgnoreCase(str2);
		if(equalsIgnoreCase==true) {
			System.out.println("The Strings are equal");
		}
		else {
			System.out.println("The Strings are not equal");
		}
	}

}
