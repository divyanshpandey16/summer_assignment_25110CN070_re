import java.util.*;
import java.math.*;
public class p12 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("Enter the first number = ");
        a=sc.nextInt();
        System.out.println();
        System.out.print("Enter the second number = ");
        b=sc.nextInt();
        int l=Math.max(a,b);
        while(true)
        {
            if(l%a==0&&l%b==0)
            {
                System.out.println();
                System.out.print("LCM of "+a+" and "+b+" is = "+l);
                break;
            }
            l++;
        }

    }
}
