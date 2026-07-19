import java.util.*;
public class Q47
{
    public static void fibonacci(int t)
    {
        if (t<=0)
        {
            System.out.println("Please enter a positive number of terms ");
            return;
        }
        int a=0;
        int b=1;
        System.out.print("Fibonacci Series: ");
        for(int i=1;i<=t;i++)
        {
            System.out.print(a+ " ");
            int c=a+b;
            a=b;
            b=c;
        }
        System.out.println();
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms = ");
        int n=sc.nextInt();
        fibonacci(n);
    }
}