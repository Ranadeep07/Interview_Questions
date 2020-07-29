/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;
class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    String str = sc.next();
		    BigInteger decimel = new BigInteger(str,2);
		    BigInteger three = new BigInteger("3");
		    BigInteger zero = BigInteger.ZERO;
		    if(decimel.mod(three) == zero)
		    	System.out.println("1");
		    else {
				System.out.println("0");
			}
		}
	}
}
