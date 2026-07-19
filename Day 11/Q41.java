import java.util.*;
public class Q41
{
    public static int addNumbers(int n1,int n2)
    {
        return n1+n2;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number = ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd number = ");
        int b=sc.nextInt();
        int s=addNumbers(a,b);
        System.out.println("The sum of "+a+" and "+b+" is = "+s);
    }
}