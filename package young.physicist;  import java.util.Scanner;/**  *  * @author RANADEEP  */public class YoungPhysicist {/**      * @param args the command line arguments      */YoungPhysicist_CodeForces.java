
package young.physicist;

import java.util.Scanner;

/**
 *
 * @author RANADEEP
 */
public class YoungPhysicist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n];
        int y[]=new int[n];
        int z[]=new int[n];
        int xsum=0,ysum=0,zsum=0;
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
            z[i]=sc.nextInt();
            xsum+=x[i];
            ysum+=y[i];
            zsum+=z[i];
        }
        if(xsum == 0 && ysum == 0 && zsum == 0)
        {
            System.out.println("YES");
        }
        else
                {
                    System.out.println("NO");
                }
    }
    
}
