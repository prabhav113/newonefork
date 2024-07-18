package high;

import java.sql.SQLOutput;
import java.util.*;
class Program1
{
    public static void main(String[] args)
    {
        int a=1;
        int b=2;

        System.out.println("Enter no.");

        Scanner sc= new Scanner(System.in);

        int c=sc.nextInt();

        if(c==a)
        {
            System.out.println("Nadeem");
        }else if(c==b){
            System.out.println("Aslam");
        }else{
            System.out.println("Nadeem Aslam");
        }
    }
}