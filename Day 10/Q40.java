import java.util.*;
public class Q40 
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of row = ");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++) 
        {
            for(int j=row-i;j>0;j--) 
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++) 
            {
                System.out.print((char)('A'+k-1));
            }
            for (int l=i-1;l>=1;l--) 
            {
                System.out.print((char)('A'+l-1));
            }
            System.out.println();
        }
    }
}
