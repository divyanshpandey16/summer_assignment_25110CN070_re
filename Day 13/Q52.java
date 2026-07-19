import java.util.*;
public class Q52 
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int size=sc.nextInt();
        int a[]=new int[size];
        int even=0;
        int odd=0;
        System.out.println("Enter "+size+" elements :");
        for (int i=0;i<size;i++) 
        {
            a[i]=sc.nextInt();
            if(a[i]%2==0) 
            {
                even++;
            } 
            else 
            {
                odd++;
            }
        }
        System.out.println("Total even elements = "+even);
        System.out.println("Total odd elements = "+odd);
    }
}