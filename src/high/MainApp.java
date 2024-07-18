package high;
import java.util.*;


public class MainApp {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name of Student");
        String sName = sc.nextLine();
        System.out.println("Enter Student Roll no.");
        int sRoll = sc.nextInt();
        System.out.println("Enter Student percentage");
        double sPercent = sc.nextDouble();

        Details d1= new Details();
        d1.getDetails(sName, sRoll, sPercent);

        d1.showDetails();

        System.out.println("-------------------------");

        Details d2= new Details();
        d2.getDetails("xxx", 23, 58.59);

        d2.showDetails();
    }

}
 class Details
 {
     static String studentName;
     static int studentRoll;
     static double studentPercent;

     public void getDetails(String n, int r, double p)
     {
         studentName=n;
         studentRoll=r;
         studentPercent=p;
     }

     public void showDetails()
     {
         System.out.println(studentName);
         System.out.println(studentRoll);
         System.out.println(studentPercent);
     }
 }