import java.util.*;
public class Q18
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,i,s=0,f=1,r,t;
        System.out.print("Enter the number to be checked = ");
        n=sc.nextInt();
        System.out.println();
        t=n;
        while(t>0)
        {
            r=t%10;
            if(r==0)
            {
                f=1;
            }
            else
            {
              for(i=1;i<=r;i++)
              {
                  f=f*i;
              }
            }
            s=s+f;
            f=1;
            r=0;
            t=t/10;
        }
        if(s==n)
        {
            System.out.print(n+" is a strong number");
        }
        else
        {
            System.out.print(n+" is not a strong number");
        }
    }
}
