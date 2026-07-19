import java.util.*;
public class Q65 
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of first array = ");
        int size1=sc.nextInt();
        int arr1[]=new int[size1];
        System.out.print("Enter the elemnts =");
        for(int i=0;i<size1;i++) 
        {
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter the size of second array = \n");
        int size2=sc.nextInt();
        int arr2[]=new int[size2];
        System.out.print("Enter the elemnts =  \n");
        for (int i = 0; i < size2; i++) 
        {
            arr2[i]=sc.nextInt();
        }
        int arr3[]=new int[size1+size2];
        int index=0;
        for(int i=0;i<size1;i++) 
        {
            arr3[index]=arr1[i];
            index++;
        }
        for(int i=0;i<size2;i++) 
        {
            arr3[index]=arr2[i];
            index++;
        }
        System.out.print("Merged array = \n");
        System.out.println(Arrays.toString(arr3));
    }
}