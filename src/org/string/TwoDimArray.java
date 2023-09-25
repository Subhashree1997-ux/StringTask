package org.string;

public class TwoDimArray {
	public static void main(String[] args) {
		int [][] a=new int[3][3];
		a[0][0]=10;
		a[0][1]=20;
	    a[0][2]=30;
	    a[1][0]=40;
	    a[1][1]=50;
	    a[1][2]=60;
	    a[2][0]=70;
	    a[2][1]=80;
	    a[2][2]=90;
	    for(int i=0;i<3;i++) {
	    	for(int j=0;j<3;j++) {
	    		System.out.print(a[i][j]+" ");
	    	}
	    	 System.out.println();
	    }
	    System.out.println("====Enhanced For Loop====");
	   for(int[] i:a) {
		   {
			   for(int c:i) {
				   System.out.print(c+" ");
			   }
			   System.out.println();
		   }
		   
		   
	   }
	}


}
