import java.util.*;
public class Q62
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
        int max=arr[0];
        int count1=0;
        for(int i=0;i<n;i++) 
        {
            int count2=0;
            for(int j=0;j<n;j++) 
            {
                if(arr[i]==arr[j]) 
                {
                    count2++;
                }
            }
            if (count2>count1) 
            {
                count1=count2;
                max=arr[i];
            }
        }
        System.out.println("Element with maximum frequency = "+max);
        System.out.println("Frequency: "+count1);
    }
}
