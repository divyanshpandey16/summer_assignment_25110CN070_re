import java.util.*;
public class Q63
{
    public static void main() 
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
        System.out.print("Enter the target sum = ");
        int sum=sc.nextInt();        
        boolean f=false;
        for(int i=0;i<n;i++) 
        {
            for(int j=i+1;j<n;j++) 
            {
                if(arr[i]+arr[j]==sum) 
                {
                    System.out.println("Pair found =("+arr[i]+", "+arr[j]+")");
                    f=true;
                }
            }
        }
        if (!f) 
        {
            System.out.println("No pair found with the given sum");
        }
    }
}
