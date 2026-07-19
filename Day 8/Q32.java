import java.util.*;
public class Q32
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows = ");
        int row=sc.nextInt();
        System.out.println();
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            for(int k=1;k<=5-i;k++) 
            {
                System.out.print("");
            }
            System.out.println();
        }
    }
}
