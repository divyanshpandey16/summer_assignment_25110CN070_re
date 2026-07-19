import java.util.*;
public class p1 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int c=0,n;
        System.out.println("Enter the number =");
        n=sc.nextInt();
        while(n>0)
        {
             n=n/10;
            c++;
        }
        System.out.println("Number of digits are= "+c);
    }
}
