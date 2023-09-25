package org.string;

import java.util.Scanner;

public class EmailId {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the mail Id:");
		String email=s.nextLine();
		boolean contains = email.contains("@");
		System.out.println(contains);
	}

}
