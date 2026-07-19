import java.util.*;
public class Q59 
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
        System.out.print("Enter the number of right rotations = ");
        int d=sc.nextInt();
        d=d%n;
        for(int i=0;i<d;i++) 
        {
            int l=arr[n-1];
            for(int j=n-1;j>0;j--) 
            {
                arr[j]=arr[j-1];
            }
            arr[0]=l;
        }
        System.out.println("Right rotated array ");
        for(int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }
}
