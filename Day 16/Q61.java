import java.util.*;
public class Q61 
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements expected (n) = ");
        int n=sc.nextInt();
        int arr[]=new int[n-1];
        System.out.println("Enter "+(n-1)+ " elements =");
        for(int i=0;i<n-1;i++) 
        {
            arr[i]=sc.nextInt();
        }
        int sum1=(n*(n+1))/2;
        int sum2=0;
        for(int i=0;i<arr.length;i++) 
        {
            sum2 =sum2+arr[i];
        }
        int t=sum1-sum2;
        System.out.println("The missing number is = "+t);
    }
}