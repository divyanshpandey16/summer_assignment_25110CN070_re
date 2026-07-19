import java.util.*;
public class Q75
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows = ");
        int r=sc.nextInt();
        System.out.print("Enter number of columns = ");
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        int trans[][]=new int[c][r];
        System.out.println("Enter the elements of the matrix = ");
        for(int i=0;i<r;i++) 
        {
            for(int j=0;j<c;j++) 
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix before Transpose = ");
        for(int i=0;i<c;i++) 
        {
            for(int j=0;j<r;j++) 
            {
             System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        for(int i=0;i<r;i++) 
        {
            for(int j=0;j<c;j++) 
            {
                trans[j][i]=a[i][j];
            }
        }
        System.out.println("Transposed matrix = ");
        for(int i=0;i<c;i++) 
        {
            for(int j=0;j<r;j++) 
            {
                System.out.print(trans[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
