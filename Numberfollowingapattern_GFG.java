/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
				Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			String str = sc.next();
			String result = "";
			//Initializing the stack
			Stack<Integer> stack = new Stack<>();
			for(int i=0;i<=str.length();i++)
			{
				//The output will contain exactly one extra value that of len of string
				stack.push(i+1);
				if(i == str.length() || str.charAt(i)=='I')
				{
					//Adding the stack top in result
					while(!stack.isEmpty()) {
					result += stack.peek();
					stack.pop();
					}
				}
			}
			System.out.println(result);
	}
}
}
