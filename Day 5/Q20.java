import java.util.*;

public class Q20 
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a positive number = ");
        n=sc.nextInt();
        int max=-1;  
        while(n%2==0) 
        {
            max=2;
            n=n/2;
        }
        
        for(int i=3;i*i<=n;i=i+2) 
        {
            while(n%i==0) 
            {
                max=i;
                n=n/i;
            }
        }
        if(n>2) 
        {
            max=n;
        }
        
        if(max==-1) 
        {
            System.out.println("No prime factors exist for this number.");
        } 
        else 
        {
            System.out.println("The largest prime factor is = " + max);
        }
    }
}