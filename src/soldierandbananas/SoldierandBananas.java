/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soldierandbananas;

import java.util.Scanner;

/**
 *
 * @author RANADEEP
 */
public class SoldierandBananas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int price=sc.nextInt();
        int tmoney=sc.nextInt();
        int qty=sc.nextInt();
        int temp = 0;
        int temp2 = 0;
        for(int i=1;i<=qty;i++)
        {
            temp=price*i;
            temp2=temp+temp2;
            
        }
        if(temp2==tmoney)
        {
            System.out.println(0);
        }
        else
        System.out.println(temp2-tmoney);
        
        
    }
    
}
