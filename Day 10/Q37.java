import java.util.*;
public class Q37
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);    
        System.out.print("Enter the number of rows = ");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++) 
        {
            for (int j=row-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int k =1;k<=(2*i-1);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}