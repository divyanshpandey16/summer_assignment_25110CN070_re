import java.util.Scanner;
public class Q42
{
    public static int maximum(int n1,int n2)
    {
        if(n1>n2)
        {
            return n1;
        }
        return n2;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number = ");
        int num1=sc.nextInt();
        System.out.print("Enter second number = ");
        int num2=sc.nextInt();
        int max=maximum(num1, num2);
        System.out.println("Maximum value is: "+max);
    }
}
