/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-->0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int sum_t=0,sum_hs = 0;
			HashMap<Integer,Boolean> hm = new HashMap<>();
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			for(Integer i:a) {
				 if(hm.get(i) == null)
				    hm.put(i,true);
				else
				    System.out.print(i+" ");
			}
			for(int i=1;i<=n;i++)
			{
			    if(hm.get(i) == null)
			        System.out.print(i+"\n");
			        
			}
			
			
		}
		}
		
		
	}
