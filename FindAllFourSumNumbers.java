// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(arr);
        int length = arr.length;
        for(int i = 0; i < length - 3; i++){
            if(i > 0 && arr[i] == arr[i - 1])
                continue;
            for(int j = i + 1; j < length - 2; j++){
                if(j > i + 1 && arr[j] == arr[j - 1])
                    continue;
                int l = j + 1;
                int r = length - 1;
                while(l < r){
                    int delta = arr[i] + arr[j] + arr[l] + arr[r] - k;
                    if(delta == 0){
                        // skip duplicates
                        if(l > j + 1 && arr[l] == arr[l - 1]){
                            l++;
                            continue;
                        }
                        if(r < length - 1 && arr[r] == arr[r + 1]){
                            r--;
                            continue;
                        }
                        ArrayList<Integer> item = new ArrayList<Integer>();
                        item.add(arr[i]);
                        item.add(arr[j]);
                        item.add(arr[l]);
                        item.add(arr[r]);
                        res.add(item);
                        l++;
                        r--;
                    } else if (delta < 0) 
                        l++;
                     else 
                        r--;
                }
            }
        }
        return res;
    }
}
