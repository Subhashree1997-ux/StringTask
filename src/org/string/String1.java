package org.string;

public class String1 {
	public static void main(String[] args) {
		String s1="GreensTechnology";
		String s2="SeleniumAutomationtool";
		String s3="RamSarath";
		String s4="j a v a p r o g r a m";
		String s5="7639416267";
		int length = s1.length();
		System.out.println("The length of "+s1+" is:"+length);
		int length2 = s2.length();
		System.out.println("The length of "+s2+" is:"+length2);
        int length3 = s3.length();
		System.out.println("The Length of "+s3+" is:"+length3);
		int length4 = s4.length();
		System.out.println("The Length of "+s4+" is:"+length4);
		int length5 = s5.length();
		System.out.println("The Length of "+s5+" is:"+length5);
		int lastIndexOf = s1.lastIndexOf('o');
		System.out.println("The last index of o is:"+lastIndexOf);
		int IndexOf =s2.indexOf('o');
		System.out.println("The last index of o is:"+IndexOf);
		int lastIndexOf2 = s3.indexOf('n');
		System.out.println("The last index of n is:"+lastIndexOf2);
		int lastIndexOf3 = s4.lastIndexOf("");
		System.out.println("The last index of EmptySpace is:"+lastIndexOf3);
		int indexOf2 = s5.indexOf('8');
		System.out.println("The index of o is:"+indexOf2);
	}

}

