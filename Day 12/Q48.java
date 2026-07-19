import java.util.*;
public class Q48
{
    public static boolean perfect(int n)
    {
        if(n<=1)
        {
            return false;
        }
        int sum=1;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        return sum==n;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer to check = ");
        int num=sc.nextInt();
        if (perfect(num))
        {
            System.out.println(num+" is a perfect number ");
        }
        else
        {
            System.out.println(num+" is not a perfect number");
        }
    }
}