import java.util.*;
public class Q81 
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string = ");
        String str=sc.nextLine();
        System.out.println("Original string = "+str);
        int count=0;
        while (!str.equals("")) 
        {
            count++;
            str=str.substring(1);
        }        
        System.out.println("Length of the string = "+count);
    }
}