import java.util.*;
public class Q55 
{
    public static int secondLargest(int arr[]) 
    {
        int large=arr[0];
        int second=-1; 
        for(int i=0;i<arr.length;i++) 
        {
            if(arr[i]>large) 
            {
                second=large;
                large=arr[i];
            } 
            else if(arr[i]>second&&arr[i]!=large) 
            {
                second=arr[i];
            }
        }
        return second;
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
        int result=secondLargest(a);
        if(result==-1) 
        {
            System.out.println("There is no second largest element");
        } 
        else 
        {
            System.out.println("The second largest element is = "+result);
        }
    }
}