import java.util.*;

public class Q28
{
    public static void reverse(int num)
    {
        if (num == 0)
        {
            return;
        }
        System.out.print(num % 10);
        reverse(num / 10);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an number to reverse = ");
        int n=sc.nextInt();
        if (n==0)
        {
            System.out.println("Reversed Number: 0");
        } 
        else
        {
            System.out.print("Reversed Number: ");
            if (n<0)
            {
                System.out.print("-");
                n=n-n; 
            }
            reverse(n);
            System.out.println();
        }
    }
}