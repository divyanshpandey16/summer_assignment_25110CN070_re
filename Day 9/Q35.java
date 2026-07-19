import java.util.*;
public class Q35
{
        public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of row = ");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++) 
        {
            char l=(char)(64+i);
            for(int j=1;j<=i;j++)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}