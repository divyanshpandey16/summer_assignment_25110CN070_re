import java.util.*;
public class Q51 
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter "+size+" elements:");
        for(int i=0;i<size;i++) 
        {
            a[i]=sc.nextInt();
        }
        int large=a[0];
        int small=a[0];
        for(int i=1;i<size;i++) 
        {
            if(a[i]>large) 
            {
                large=a[i];
            }
            if(a[i]<small) 
            {
                small=a[i];
            }
        }
        System.out.println("Largest element = "+large);
        System.out.println("Smallest element = "+small);
    }
}
