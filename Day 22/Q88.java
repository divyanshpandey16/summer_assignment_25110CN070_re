import java.util.*;
public class Q88
{
    public static void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string = ");
        String str = sc.nextLine();
        System.out.println("Original string = "+str);
        String r="";
        while(!str.equals(""))
        {
            char ch = str.charAt(0);
            if(ch!=' ')
            {
                r=r+ch;
            }
            str=str.substring(1);
        }
        System.out.println("String after removing spaces = "+r);
    }
}
