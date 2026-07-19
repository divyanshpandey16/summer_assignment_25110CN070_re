import java.util.*;
public class p6
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,s=0;
        System.out.print("Emter the number = ");
        System.out.println();
        n=sc.nextInt();
        while(n>0)
        {
            int r=n%10;
            s=s*10+r;
            n=n/10;
        }
        System.out.println("Sum of digits are = "+s);
    }
}

