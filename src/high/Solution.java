package high;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            cal c=new cal();
            c.calculation(a, b, n);
            System.out.println();
        }
        in.close();
    }
}

class cal
{
    int sq, ans;
    public void calculation(int a,int b, int n)
    {
        int A=a;
        int B=b;
        int N=n;
        int cnt=2;

        for (int i=0;i<n;i++)
        {
            if(i==0)
            {
                sq=1;
                ans=A+sq*B;
                System.out.print(ans +" ");
            }
            else if(i==1)
            {
                sq=2;
                ans+=sq*B;
                System.out.print(ans +" ");

            }
            else if(i>1)
            {
                while(cnt<=i)
                {
                    sq*=2;
                    ans+=sq*B;
                    cnt++;
                    System.out.print(ans +" ");
                }
            }
        }
    }
}

