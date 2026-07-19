import java.util.*;
public class Q114
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("--- Array Menu ---");
        System.out.println("1. Display Array");
        System.out.println("2. Search an Element");
        System.out.println("3. Find Maximum and Minimum");
        System.out.println("4. Calculate Sum and Average");
        System.out.print("Enter your choice (1-4): ");
        int choice=sc.nextInt();
        switch(choice) 
        {
            case 1:
                System.out.print("Array elements: ");
                for(int i=0;i<n;i++)
                {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
                break;
            case 2:
                System.out.print("Enter element to search: ");
                int target=sc.nextInt();
                int index=-1;
                for(int i=0;i<n;i++)
                {
                    if(arr[i]==target)
                    {
                        index=i;
                        break;
                    }
                }
                if(index!=-1)
                {
                    System.out.println("Element found at index: "+index);
                }
                else
                {
                    System.out.println("Element not found in the array.");
                }
                break;
            case 3:
                int max=arr[0];
                int min=arr[0];
                for(int i=1;i<n;i++)
                {
                    if(arr[i]>max)
                    {
                        max=arr[i];
                    }
                    if(arr[i]<min)
                    {
                        min=arr[i];
                    }
                }
                System.out.println("Maximum value: "+max);
                System.out.println("Minimum value: "+min);
                break;
            case 4:
                int sum=0;
                for(int i=0;i<n;i++)
                {
                    sum=sum+arr[i];
                }
                double avg=(double)sum/n;
                System.out.println("Sum: "+sum);
                System.out.println("Average: "+avg);
                break;
            default:
                System.out.println("Invalid choice! Please select an option from 1 to 4.");
                break;
        }
    }
}

