package high;

import java.util.*;


public class calculator {
    public static void main(String[] args)
    {
        boolean status= true;
        Scanner sc= new Scanner(System.in);
        calci ca = new calci();


            while(status)
            {
                System.out.print("A. Add \nB. sub \nC. mul \nD. Div \nE. Exit");
                System.out.println("Enter char");
                char c=sc.next().charAt(0);
                if(c=='E')
                {
                    status= false;
                    System.out.println("finish");
                    System.exit(0);
                }
                else {
                    System.out.println("Enter the number1 and number2 for the operation");
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    switch (c)
                    {
                        case 'A':
                            ca.add(a, b);
                            break;

                        case 'B':
                            ca.sub(a, b);
                            break;

                        case 'C':
                            ca.mul(a, b);
                            break;

                        case 'D':
                            ca.div(a, b);
                            break;

                        case 'r':
                            ca.rem(a, b);
                            break;
                    }
                }
            }





    }

}
 class calci
{
    public void add(int a, int b)
    {
            System.out.println(a+b);
    }
    public void sub(int a, int b)
    {
        System.out.println(a-b);
    }
    public void mul(int a, int b)
    {
        System.out.println(a*b);
    }
    public void div(int a, int b)
    {
        System.out.println(a/b);
    }
    public void rem(int a, int b)
    {
        System.out.println(a%b);
    }
}