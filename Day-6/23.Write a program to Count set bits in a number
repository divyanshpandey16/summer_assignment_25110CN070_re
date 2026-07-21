import java.util.*;
public class Q23
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a decimal number = ");
        int d=sc.nextInt();
        if (d==0) 
        {
            System.out.println("Binary number = 0");
            System.out.println("Number of set bits = 0");
        }
        String b=""; 
        int n=d;
        while(n>0) 
        {
            int r=n%2;
            b=r+b;
            n=n/2;
        }
        System.out.println("Binary number = " + b);
        int c=0;
        for(int i=0;i<b.length();i++) 
        {
            char ch=b.charAt(i); 
            if(ch=='1') 
            {
                c++;
            }
        }
        System.out.println("Number of set bits = " + c);
    }
}
