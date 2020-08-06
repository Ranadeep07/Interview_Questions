import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String str = sc.next();
            for (int i = 0; i < str.length(); i++) {
                if(i % 2 == 0) {
                    System.out.print(str.charAt(i));
                }
            }
            System.out.print(" ");
            for (int i = 0; i < str.length(); i++) {
                if(i % 2 != 0) {
                    System.out.print(str.charAt(i));
                }
            }
            System.out.println();
        }
    }
}
