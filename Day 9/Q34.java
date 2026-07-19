import java.util.*;
public class Q34
{
    public static void main()
     {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row=sc.nextInt();
        for(int i=row;i>=1;i--)
         {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
