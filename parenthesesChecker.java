/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String str = sc.next();
			Stack<Character> s = new Stack<>();
			boolean isBalanced = true;
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[')
				{
					s.push(str.charAt(i));
					continue;
				}
				if(s.isEmpty()){
				    isBalanced = false;
				    break;
				}
				if(str.charAt(i)==')') {
					if(s.peek()== '(') {
						s.pop();
					}
					else {
						isBalanced = false;
					}
				}
				if(str.charAt(i)=='}') {
					if(s.peek()== '{') {
						s.pop();
					}
					else {
						isBalanced = false;
					}
				}
				if(str.charAt(i)==']') {
					if(s.peek()== '[') {
						s.pop();
					}
					else {
						isBalanced = false;
					}
				}
			}
		
			if(!s.isEmpty())
			{
				System.out.println("not balanced");
			}
			else {
				if(isBalanced) {
					System.out.println("balanced");
				}
				else {
					System.out.println("not balanced");
				}
			}
	}
}
}
