import java.util.*;
public class p11
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("Enter the first number a = ");
        a=sc.nextInt();
        System.out.println();
        System.out.print("Enter the second number b = ");
        b=sc.nextInt();
        System.out.println();
        while(b!=0)
        {
            int t=b;
            b=a%b;
            a=t;
        }
        System.out.print("The GCD of the numbers are = "+a);

    }
}
