import java.util.*;
public class Q102
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age = ");
        int a=sc.nextInt();
        if(a>=18)
        {
            System.out.println("You are eligible to vote.");
        }
        else
        {
            int w=18-a;
            System.out.println("Not eligible. Wait for "+w+ " more years.");
        }
    }
}
