import java.util.*;
public class Q64
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements = ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements =");
        for(int i=0;i<n;i++) 
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Array after removing duplicates = ");
        for(int i=0;i<n;i++) 
        {
            boolean f=false;
            for(int j=0;j<i;j++) 
            {
                if(arr[i]==arr[j]) 
                {
                    f=true;
                    break;
                }
            }
            if (!f) 
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}