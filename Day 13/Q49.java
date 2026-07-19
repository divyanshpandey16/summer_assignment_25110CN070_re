import java.util.*;
public class Q49 
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int size=sc.nextInt();

        int a[]=new int[size];
        System.out.println("Enter "+size+" elements :");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("\nThe elements of the array are:");
        for(int i=0;i<size;i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println(); 
    }
}