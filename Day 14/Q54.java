import java.util.*;
public class Q54 
{
    public static int frequency(int arr[],int key) 
    {
        int c=0;
        for(int i=0;i<arr.length;i++) 
        {
            if(arr[i]==key) 
            {
                c++;
            }
        }
        return c;
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
        System.out.print("Enter the value to find frequency for = ");
        int n=sc.nextInt();
        int result=frequency(a,n);
        System.out.println("Frequency of "+n+" is : "+result);
    }
}
