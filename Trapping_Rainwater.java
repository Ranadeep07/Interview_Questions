// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Trap obj = new Trap();
		    
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}

// } Driver Code Ends


class Trap{
    
    // function to find the trapped water in between buildings
    // arr: input array
    // n: size of array
    static int trappingWater(int arr[], int n) { 
        
        // Your code here
        	int left[] = new int[n];
    	int right[] = new int[n];
    	int l_max = 0,r_max=0,min=0,sum = 0; 
    	for (int i = 0; i < arr.length; i++) {
			l_max = Math.max(l_max,arr[i]);
			left[i] = l_max;
		}
    	for (int i = n-1; i >=0; i--) {
			r_max = Math.max(r_max,arr[i]);
			right[i] = r_max;
		}
    	for (int i = 0; i < n; i++) {
			min = Math.min(left[i],right[i]) - arr[i];
			sum += min;
		}
        return sum;
    } 
}

