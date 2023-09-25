package org.string;

public class OneDimArray {
	public static void main(String[] args) {
		int [] a=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		int b=a.length;
		System.out.println("======for loop======");
        for(int i=0;i<a.length;i++) {
        	System.out.println(a[i]);
        }
        System.out.println("======Reverse======");
        for(int i=a.length-1;i>=0;i--) {
        	System.out.println(a[i]);
        }
        System.out.println("======Enhanced for loop======");
        for(int c:a) {
        	System.out.println(c);
        }
		
	}

}
