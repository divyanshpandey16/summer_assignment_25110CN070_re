import java.util.*;
public class Q68 
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of first array = ");
        int size1=sc.nextInt();
        int arr1[]=new int[size1];
        System.out.println("Enter elements of first array = ");
        for(int i=0;i<size1;i++) 
        {
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter size of second array = ");
        int size2=sc.nextInt();
        int arr2[]=new int[size2];
        System.out.println("Enter elements of second array = ");
        for(int i=0;i<size2;i++) 
        {
            arr2[i]=sc.nextInt();
        }
        int arr3[]=new int[Math.min(size1,size2)];
        int size3=0;
        for(int i=0;i<size1;i++) 
        {
            boolean e=false;
            for(int j=0;j<size2;j++) 
            {
                if(arr1[i]==arr2[j]) 
                {
                    e=true;
                    break;
                }
            }
            if(e) 
            {
                boolean f=false;
                for(int k=0;k<size3;k++) 
                {
                    if(arr3[k]==arr1[i]) 
                    {
                        f=true;
                        break;
                    }
                }
                if(!f) 
                {
                    arr3[size3]=arr1[i];
                    size3++;
                }
            }
        }
        int arr4[]=new int[size3];
        for(int i=0;i<size3;i++) 
        {
            arr4[i]=arr3[i];
        }
        System.out.println("Common elements: "+Arrays.toString(arr4));
    }
}
