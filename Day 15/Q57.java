import java.util.*;
public class Q57 
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements =");
        for(int i=0;i<n;i++) 
        {
            arr[i]=sc.nextInt();
        }
        int a=0;
        int b=n-1;
        while(a<b) 
        {
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        }
        System.out.println("Reversed array :");
        for(int i=0;i<n;i++) 
        {
            System.out.print(arr[i]+" ");
        }
    }
}