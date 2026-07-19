import java.util.*;
public class Q45
{
    public static boolean palindrome(int n)
    {
        if(n<0)
        {
            return false;
        }
        int n1=n;
        int n2=0;
        while(n!=0)
        {
            int r=n%10;
            n2=(n2*10)+r;
            n=n/10;
        }
        return n1==n2;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to check = ");
        int num=sc.nextInt();
        if(palindrome(num))
        {
            System.out.println(num+" is a palindrome number");
        }
        else
        {
            System.out.println(num+" is not a palindrome number");
        }
    }
}