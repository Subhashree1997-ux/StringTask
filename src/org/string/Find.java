package org.string;

import java.util.Scanner;

public class Find {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the  mail address:");
		String mail=s.next();
		boolean contains = mail.contains("gmail");
	    System.out.println("The string contains gmail");
	    String replaceAll = mail.replaceAll("gmail", "yahoo");
	    System.out.println(replaceAll);
	}

}
