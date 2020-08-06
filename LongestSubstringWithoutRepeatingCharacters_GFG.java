// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	    int t=Integer.parseInt(br.readLine());
    
	    while(t > 0){
	        String s = br.readLine();
	        Solution T = new Solution();
	        
	        System.out.println(T.SubsequenceLength(s));
	        
            t--;
	    }
	}
    
}



// } Driver Code Ends


//User function Template for Java


class Solution
{
    

    int SubsequenceLength(String s) 
    {
        //Sliding window technique
		int a_pointer = 0;
		int b_pointer = 0;
		int max = 0;
		HashSet<Character> hSet = new HashSet<>();
		while (b_pointer<s.length()) {
			if(!hSet.contains(s.charAt(b_pointer))) {
				hSet.add(s.charAt(b_pointer));
				b_pointer++;
				max = Math.max(max, hSet.size());
			}
			else {
				hSet.remove(s.charAt(a_pointer));
				a_pointer++;
			}
		}
		return max;  
    }
    
}

