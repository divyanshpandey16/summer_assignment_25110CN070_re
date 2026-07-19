import java.util.*;
public class Q99
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of names = ");
        int n=sc.nextInt();
        sc.nextLine();
        String arr[]=new String[n];
        System.out.println("Enter names = ");
        for(int i=0;i<n;i++) 
        {
            arr[i]=sc.nextLine();
        }
        for(int i=0;i<n-1;i++) 
        {
            for(int j=0;j<n-i-1;j++) 
            {
                if(arr[j].compareTo(arr[j+1])>0) 
                {
                    String t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println("Sorted names = ");
        for(int i=0;i<n;i++) 
        {
            System.out.println(arr[i]);
        }
    }
}