package high;
import java.util.*;

public class MainAppPayment {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the payment Method");
        System.out.println("enter 1. UPI \n enter 2. COD \n enter 3. NetBanking \n enter 4. Cards");

        int mtd= sc.nextInt();
        PaymentDetails p1=new PaymentDetails();

        if(mtd == 1)
        {
            p1.payment(364);
        }
        else if(mtd == 2)
        {
            p1.payment("pune, Maharastra, 48666");
        }
        else if(mtd == 3)
        {
            p1.payment(344, 463088564954l, "nov 12", "Ajay");
        }
        else if(mtd == 4)
        {
            p1.payment("Ajay", 488423018594l, "Nov15", 349);
        }
    }

}

class PaymentDetails
{
    public void payment(int pin)
    {
       System.out.println("User choose UPI payment");
       System.out.println("pin is"+ pin);
    }
    public void payment(String address)
    {
        System.out.println("User choose COD payment");
        System.out.println("Address is"+ address);
    }
    public void payment(int cvv, long accNo, String exp, String Name)
    {
        System.out.println("User choose Net Banking payment");
        System.out.println("Details Are" + cvv + "is the CVV" + accNo + "is the account no." + exp + "is the expiry date" + Name + "is the name");
    }
    public void payment(String Name, long cardNo, String exp, int cvv )
    {
        System.out.println("User choose Card payment");
        System.out.println("Details Are" + cvv + "is the CVV" + cardNo + "is the card no." + exp + "is the expiry date" + Name + "is the name");
    }
}
