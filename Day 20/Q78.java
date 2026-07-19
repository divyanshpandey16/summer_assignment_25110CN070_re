import java.util.*;
public class Q78
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
        int f=1;
        for(int i=0;i<n;i++) 
        {
            for(int j=0;j<n;j++) 
            {
                if(a[i][j] != a[j][i]) 
                {
                    f=0;
                    break;
                }
            }
        }
        if(f==1)
        {
            System.out.println("The matrix is a symmetric matrix.");
        }
        else
        {
            System.out.println("The matrix is not a symmetric matrix.");
        }
    }
}
