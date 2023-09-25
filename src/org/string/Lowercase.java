package org.string;

import java.util.Scanner;

public class Lowercase {
 public static void main(String[] args) {
	 char ch2;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the name:");
	String name=s.nextLine();
	//String upperCase = name.toUpperCase();
	//System.out.println(upperCase);
	for(int i=0;i<name.length();i++) {
		char ch=name.charAt(i);
		if(ch>='A'&&ch<='Z') {
			ch2=Character.toLowerCase(ch);
			System.out.print(ch2);
		}
		else if(ch>='a'&&ch<='z'){
			ch2= Character.toUpperCase(ch);
			System.out.print(ch2);
		}
		else {
			System.out.print("");
		}
		
		
	}
	
}
}
