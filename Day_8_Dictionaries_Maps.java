//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            HashMap<String,Integer> hMap = new HashMap<>();
            for(int i = 0; i < n; i++){
                String name = in.next();
                int phone = in.nextInt();
                hMap.put(name, phone);
            }
           
            while(in.hasNext()){
                String s = in.next();
                if(hMap.containsKey(s)) {
                    System.out.println(s+"="+hMap.get(s));
                }
                else {
                    System.out.println("Not found");
                }
            }
            in.close();
    }
}
