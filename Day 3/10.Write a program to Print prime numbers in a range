import java.util.*;
public class p10
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,n,c=0;
        System.out.print("Enter the range = ");
        n=sc.nextInt();
        System.out.println();
        System.out.print("List of prime numbers are : ");
        System.out.println();
        for(i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
                else
                {
                  continue;
                }
            }
            if(c==2)
            {
             System.out.print("  "+i);
            }
            else
            {
                c=0;
            }
        }
    }
}
