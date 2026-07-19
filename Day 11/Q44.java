import java.util.*;
public class Q44
{
    public static long factorial(int n)
    {
        long r=1;
        for(int i=1;i<=n;i++)
        {
            r=r*i;
        }
        return r;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num=sc.nextInt();
        long f=factorial(num);
        System.out.println("Factorial of "+num+" is = "+f);
    }
}
