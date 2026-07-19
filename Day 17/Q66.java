import java.util.*;
public class Q66 
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of first array = ");
        int size1=sc.nextInt();
        int array1[]=new int[size1];
        System.out.println("Enter elements of first array = ");
        for(int i=0;i<size1;i++) 
        {
            array1[i]=sc.nextInt();
        }
        System.out.print("Enter size of second array = ");
        int size2=sc.nextInt();
        int array2[]=new int[size2];
        System.out.println("Enter elements of second array = ");
        for(int i=0;i<size2;i++) 
        {
            array2[i]=sc.nextInt();
        }
        int array3[]=new int[size1+size2];
        int size3=0;
        for(int i=0;i<size1;i++) 
        {
            boolean f=false;
            for(int j=0;j<size3;j++) 
            {
                if (array3[j]==array1[i]) 
                {
                    f=true;
                    break;
                }
            }
            if(!f) 
            {
                array3[size3]=array1[i];
                size3++;
            }
        }
        for(int i=0;i<size2;i++) 
        {
            boolean f=false;
            for (int j=0;j<size3;j++) 
            {
                if(array3[j]==array2[i]) 
                {
                    f=true;
                    break;
                }
            }
            if(!f) 
            {
                array3[size3]=array2[i];
                size3++;
            }
        }
        int array4[]=new int[size3];
        for(int i=0;i<size3;i++) 
        {
            array4[i]=array3[i];
        }
        System.out.println("Union of arrays: "+Arrays.toString(array4));
    }
}