import java.util.*;
public class Q31
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows = ");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)('A'+j-1));
            }
            System.out.println();
        }
    }
}
