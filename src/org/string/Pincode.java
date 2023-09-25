package org.string;

import java.util.Scanner;

public class Pincode {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Address:");
	String address=s.nextLine();
	boolean contains = address.contains("pincode");
	System.out.println("The address contains pincode:"+contains);
	String replaceAll = address.replaceAll("pincode", " ");
	System.out.println(replaceAll);
	
	
}
}
