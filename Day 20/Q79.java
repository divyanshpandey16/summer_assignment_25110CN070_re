import java.util.*;
public class Q79
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of square matrix = ");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("Enter the elements of the matrix = ");
        for(int i=0;i<n;i++) 
        {
            for(int j=0;j<n;j++) 
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original matrix = ");
        for(int i=0;i<n;i++) 
        {
            for(int j=0;j<n;j++) 
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++) 
        {
            int s=0;
            for(int j=0;j<n;j++) 
            {
                s=s+a[i][j];
            }
            System.out.println("Sum of row "+(i+1)+" = "+s);
        }
    }
}
