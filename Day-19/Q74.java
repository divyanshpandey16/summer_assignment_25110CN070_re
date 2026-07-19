import java.util.*;
public class Q74
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows = ");
        int r=sc.nextInt();
        System.out.print("Enter number of columns = ");
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        int b[][]=new int[r][c];
        int diff[][]=new int[r][c];
        System.out.println("Enter the elements of first matrix = ");
        for(int i=0;i<r;i++) 
        {
            for(int j=0;j<c;j++) 
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix = ");
        for(int i=0;i<r;i++) 
        {
            for(int j=0;j<c;j++) 
            {
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++) 
        {
            for(int j=0;j<c;j++) 
            {
                diff[i][j]=a[i][j]-b[i][j];
            }
        }
        System.out.println("Resultant matrix after subtraction = ");
        for(int i=0;i<r;i++) 
        {
            for(int j=0;j<c;j++) 
            {
                System.out.print(diff[i][j]+"\t");
            }
            System.out.println();
        }
    }
}