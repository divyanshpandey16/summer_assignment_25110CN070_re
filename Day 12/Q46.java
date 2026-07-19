import java.util.*;
import java.math.*;
public class Q46
{
    public static boolean armstrong(int n)
    {
        if(n<0)
        {
            return false;
        }
        int n1=n;
        int n2=n;
        int d=0;
        int sum=0;
        while (n2!= 0)
        {
            d++;
            n2=n2/10;
        }
        n2=n;
        while(n2!=0)
        {
            int r=n2%10;
            sum=sum+(int)Math.pow(r,d);
            n2=n2/10;
        }
        return n1==sum;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check = ");
        int num=sc.nextInt();
        if (armstrong(num))
        {
            System.out.println(num+" is an Armstrong number");
        }
        else
        {
            System.out.println(num+" is not an Armstrong number");
        }
    }
}
