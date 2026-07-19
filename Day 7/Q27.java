import java.util.Scanner;

public class Q27
{
    public static int sumOfDigits(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return (n%10)+sumOfDigits(n/10);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);    
        System.out.print("Enter an number = ");
        int num=sc.nextInt();
        int absoluteNum = Math.abs(num);
        int r=sumOfDigits(absoluteNum);
        System.out.println("The sum of the digits of "+num+" is =  "+r);
    }
}
