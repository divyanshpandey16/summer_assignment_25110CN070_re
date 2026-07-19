import java.util.*;
public class Q97
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the first sorted array = ");
        int n1=sc.nextInt();
        int arr[]=new int[n1];
        System.out.println("Enter "+n1+" elements in sorted order = ");
        for(int i=0;i<n1;i++) 
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the size of the second sorted array =  ");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        System.out.println("Enter "+n2+ " elements in sorted order = ");
        for(int i=0;i<n2;i++) 
        {
            arr2[i]=sc.nextInt();
        }
        int arr3[]=new int[n1+n2];
        int i=0;
        int j=0;
        int k=0;
        while(i<n1&&j<n2) 
        {
            if(arr[i]<=arr2[j]) 
            {
                arr3[k]=arr[i];
                i++;
            } 
            else 
            {
                arr3[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<n1) 
        {
            arr3[k]=arr[i];
            i++;
            k++;
        }
        while(j<n2) 
        {
            arr3[k]=arr2[j];
            j++;
            k++;
        }
        System.out.println("Merged Sorted Array = "+Arrays.toString(arr3));
    }
}