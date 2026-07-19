import java.util.*;
public class Q26
{
    public static int Fibonacci(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int t;
        System.out.print("Enter the number of terms = ");
        t=sc.nextInt();
        System.out.println();
        System.out.println("Fibonacci Series up to "+t+" terms:");
        for (int i=0;i<t;i++)
        {
            System.out.print(Fibonacci(i)+" ");
        }
    }
}
