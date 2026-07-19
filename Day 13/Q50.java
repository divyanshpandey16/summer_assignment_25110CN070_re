import java.util.*;
public class Q50 
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int size=sc.nextInt();
        int a[]=new int[size];
        int sum=0;
        System.out.println("Enter "+size+" elements :");
        for(int i=0;i<size;i++) 
        {
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        double avg=(double)sum/size;
        System.out.println("Sum of array elements = "+sum);
        System.out.println("Average of array elements = "+avg);
    }
}
