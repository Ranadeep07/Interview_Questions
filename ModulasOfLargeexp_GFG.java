/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;
class GFG {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    String base = sc.next();
		    String exp = sc.next();
		    String mod = sc.next();
		    BigInteger b1 = new BigInteger(base);
		    BigInteger b2 = new BigInteger(exp);
		    BigInteger b3 = new BigInteger(mod);
		    System.out.println(powMod(b1,b2,b3));
		}
	}
	static BigInteger powMod(BigInteger base, BigInteger exp,BigInteger mod) {
			BigInteger result;
			result = base.modPow(exp,mod);
			return result;
			
		}
	}

