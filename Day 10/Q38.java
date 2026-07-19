import java.util.*;
public class Q38 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows = ");
        int row=sc.nextInt();
        for(int i=row;i>=1;i--) 
        {
            for(int j=row-i;j>0;j--) 
            {
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
