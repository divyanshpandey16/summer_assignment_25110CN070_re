import java.util.*;
public class p3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,n,m=1;
        System.out.print("Enter the number \n");
        n=sc.nextInt();
        for(i=1;i<=10;i++)
        {
            m=n*i;
            System.out.println(n+"*"+i+"= "+m);

        }
    }
}