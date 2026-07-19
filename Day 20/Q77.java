import java.util.*;
public class Q77
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows and columns of first matrix = ");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        System.out.print("Enter rows and columns of second matrix = ");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        if(c1!=r2)
        {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }
        int a[][]=new int[r1][c1];
        int b[][]=new int[r2][c2];
        int c[][]=new int[r1][c2];
        System.out.println("Enter the elements of the first matrix = ");
        for(int i=0;i<r1;i++) 
        {
            for(int j=0;j<c1;j++) 
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix = ");
        for(int i=0;i<r2;i++) 
        {
            for(int j=0;j<c2;j++) 
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("First Matrix = ");
        for(int i=0;i<r1;i++) 
        {
            for(int j=0;j<c1;j++) 
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Second Matrix = ");
        for(int i=0;i<r2;i++) 
        {
            for(int j=0;j<c2;j++) 
            {
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                c[i][j]=0;
                for(int k=0;k<c1;k++)
                {
                    c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
                }
            }
        }
        System.out.println("Product matrix = ");
        for(int i=0;i<r1;i++) 
        {
            for(int j=0;j<c2;j++) 
            {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
    }
}