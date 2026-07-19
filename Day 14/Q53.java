import java.util.*;
public class Q53 
{
    public static int linear(int arr[], int key) 
    {
        for(int i=0;i<arr.length;i++) 
        {
            if(arr[i]==key) 
            {
                return i;
            }
        }
        return -1;
    }
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements = ");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter "+size+" integers ");
        for(int i=0;i<size;i++) 
        {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the value to search for = ");
        int n=sc.nextInt();
        int result=linear(a,n);
        if(result!=-1) 
        {
            System.out.println("Element found at index : "+result);
        } 
        else 
        {
            System.out.println("Element not found in the array");
        }
    }
}