// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 
    	for(int i=0;i<t;i++)
    	{
            String str=br.readLine();
    		String[] starr=str.split(" ");
    	    int n=Integer.parseInt(starr[0]);
    		int d= Integer.parseInt(starr[1]);
    		
            int[] arr=new int[n];
    		String str1=br.readLine();
    		String[] starr1=str1.split(" ");
    		for(int j=0;j<n;j++)
    		{
    		  arr[j]= Integer.parseInt(starr1[j]);
    		}
    		
            new Solution().rotateArr(arr, d, n);
    		StringBuffer sb=new StringBuffer();
            for(int t1=0;t1<n;t1++)
                sb.append(arr[t1]+" ");
            System.out.println(sb);
         }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static void rotateArr(int arr[], int d, int n)
    {
        int temp[]=new int[n];
        int j=0;
        for(int i=d;i<n;i++)
        {
            temp[j++]=arr[i];
        }
        for(int i=0;i<d;i++)
        {
            temp[j++]=arr[i];
        }
        for(int i=0;i<j;i++)
        {
            arr[i]=temp[i];
        }
        
    }
}
