import java.util.*;
public class p8
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,c,s=0;
        System.out.print("Enter the number = ");
        n=sc.nextInt();
        c=n;
        while(n>0)
        {
            int r=n%10;
            s=s*10+r;
            n=n/10;
        }
        System.out.println();
        if(c==s)
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not palimdrome");
    }
}
