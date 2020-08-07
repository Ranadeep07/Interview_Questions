import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String binaryString = "";
        while(n>0) {
            binaryString += n%2;
            n = n/2;
            
        }
        StringBuilder sBuilder = new StringBuilder(binaryString);
        sBuilder.reverse();
        int count = 0;
        int max = 0;
        for (int i = 0; i < sBuilder.length(); i++) {
            if(sBuilder.charAt(i)=='0') {
                count=0;
            }else {
                count++;
            }
            max = Math.max(count, max);
        }
        System.out.println(max);
        scanner.close();
    }
}
