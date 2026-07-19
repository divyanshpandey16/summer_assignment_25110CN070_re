import java.util.*;
public class Q24
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base (x): ");
        double x=sc.nextDouble();
        System.out.print("Enter exponent (n): ");
        int n=sc.nextInt();
        double o1=x;
        int o2=n;
        double r=1.0;
        long e=n; 
        if(e<0) 
        {
            x=1.0/x;
            e=-e;
        }
        double c=x;
        while(e>0) 
        {
            if(e%2==1)
            {
                r=r*c;
            }
            c=c*c;
            e=e/2;
        }
        System.out.println(o1+" ^ "+o2+" = "+r);
    }
}
