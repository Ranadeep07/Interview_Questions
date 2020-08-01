package GFG;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExcelSheet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
	    int t=Integer.parseInt(br.readLine());
    
	    while(t > 0){
	        int n = Integer.parseInt(br.readLine());
	        Solution T = new Solution();
	        
	        System.out.println(T.excelColumn(n));
	        
            t--;
	    }
	}
	}

class Solution {
    public String excelColumn(int n) {
    	StringBuilder sb = new StringBuilder();
    	
    	while(n>0) {
    		n--;
    		char toAdd = (char)((n%26)+65);
    		sb.insert(0,toAdd);
    		n /= 26;
    		
    	}
        return sb.toString();
        
    }
}
