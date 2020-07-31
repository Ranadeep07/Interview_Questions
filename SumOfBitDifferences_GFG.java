package GFG;

import java.util.Scanner;

public class sumOfBitDifferences {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n =sc.nextInt();
		    int a[] = new int[n];
		    for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				
			}
		    int temp = 0,sum = 0,result = 0;
		    for (int i = 0; i < a.length-1; i++) {
				for (int j = i+1; j < a.length; j++) {
					temp = a[i]+a[j];
					while (temp>0) {
						temp = temp & temp-1 ;
						result ++;
					}
				}
			}
		    sum += result*2;
		    System.out.println(sum);
		} 
	}
}
