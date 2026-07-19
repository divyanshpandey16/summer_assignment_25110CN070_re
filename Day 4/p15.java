import java.util.*; 
import java.math.*;
public class p15
{
    public static void main()
    {
      Scanner sc=new Scanner(System.in);
      int n,r,c=0,t=0,q=0;
      double s=0.0;
      System.out.print("Enter the number to be checked = ");
      n=sc.nextInt();
      System.out.println();
      t=n;
      q=n;
      while(n>0)
      {
        r=n%10;
        c++;
        n=n/10;
      }
      r=0;
     while(t>0)
      {
       r=t%10;
       s=s+(Math.pow(r,c));
       t=t/10;
      }
      if(q==s)
      {
        System.out.print(q+" Is armstrong number");
      }
      else
      {
        System.out.print(q+" Is not armstrong number");
      }
    }
}
