import java.util.*;
public class Q43
{
    public static boolean prime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num=sc.nextInt();
        if (prime(num))
        {
            System.out.println(num+" is a prime number");
        }
        else
        {
            System.out.println(num+" is not a prime number");
        }
    }
}
