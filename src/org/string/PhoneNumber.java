package org.string;

import java.util.Scanner;

public class PhoneNumber {
	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the mobile no");
    String phno=s.nextLine();
    int length2 = phno.length();
    if(length2==10) {
    	System.out.println("The phone no is valid");
    	}
    else {
    	System.out.println("The phone is not valid");
    }
    	
    }
}
