import java.util.*;
public class Q56 
{
    public static void duplicate(int arr[]) 
    {
        boolean f=false;
        for(int i=0;i<arr.length;i++) 
        {
            for(int j=i+1;j<arr.length;j++) 
            {
                if(arr[i]==arr[j]) 
                {
                    System.out.println("Duplicate element found = "+arr[i]);
                    f=true;
                    break;
                }
            }
        }
        if(!f) 
        {
            System.out.println("No duplicate elements found");
        }
    }
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements = ");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter "+size+" integers =");
        for(int i=0;i<size;i++) 
        {
            a[i]=sc.nextInt();
        }
        duplicate(a);
    }
}
