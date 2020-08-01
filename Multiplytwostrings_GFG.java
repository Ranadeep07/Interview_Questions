package GFG;

import java.math.BigInteger;
import java.util.Scanner;

public class Multiplytwostrings {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            Sol g=new Sol();
            System.out.println(g.multiply(a,b));
        }
	}
}
class Sol
{
    public String multiply(String a,String b)
    {
           String result = "";
           BigInteger b1 = new BigInteger(a);
           BigInteger b2 = new BigInteger(b);
           BigInteger sol = b1.multiply(b2);
           result += sol;
           return result;
    }
}
