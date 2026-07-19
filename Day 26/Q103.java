import java.util.*;
public class Q103
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        double bal=100000.0;
        while(true)
        {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter choice = ");
            int ch=sc.nextInt();
            if(ch==1)
            {
                System.out.println("Current Balance = Rs. "+bal);
            }
            else if(ch==2)
            {
                System.out.print("Enter deposit amount = ");
                double dep=sc.nextDouble();
                bal=bal+dep;
                System.out.println("Successfully deposited. New Balance = Rs. "+bal);
            }
            else if(ch==3)
            {
                System.out.print("Enter withdrawal amount = ");
                double wit=sc.nextDouble();
                if(wit<=bal)
                {
                    bal=bal-wit;
                    System.out.println("Please collect cash. Remaining Balance = Rs. "+bal);
                }
                else
                {
                    System.out.println("Insufficient balance!");
                }
            }
            else if(ch==4)
            {
                System.out.println("Thank you for using our ATM!");
                break;
            }
            else
            {
                System.out.println("Invalid choice! Try again.");
            }
        }
    }
}

