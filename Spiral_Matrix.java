// { Driver Code Starts


import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends




class Solution{
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        if(matrix.length == 0) return al;
        int tRow = 0, bRow = r-1, rCol = c-1 , lCol = 0, dir = 0;
        //For right dir = 0
        //For bottom dir = 1
        //For left dir = 2
        //For up dir = 3
        while(tRow <= bRow && lCol <= rCol){
            if(dir == 0){
                for(int i=lCol;i<=rCol;i++){
                    al.add(matrix[tRow][i]);
                }
                tRow++;
                dir++;
            }
            else if(dir == 1){
                for(int i=tRow;i<=bRow;i++){
                    al.add(matrix[i][rCol]);
                }
                rCol--;
                dir++;
            }
            else if(dir == 2){
                for(int i=rCol;i>=lCol;i--){
                    al.add(matrix[bRow][i]);
                }
                bRow--;
                dir++;
            }
             else if(dir == 3){
                for(int i=bRow;i>=tRow;i--){
                    al.add(matrix[i][lCol]);
                }
                lCol++;
                dir=0;
            }
        }
        return al;
    }
}
