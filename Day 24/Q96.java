import java.util.*;
public class Q96
{
    public static void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string = ");
        String str = sc.nextLine();
        System.out.println("Original string = " + str);
        String r="";
        for(int i=0;i<str.length();i++) 
        {
            char ch=str.charAt(i);
            if(r.indexOf(ch)==-1) 
            {
                r=r+ch;
            }
        }
        System.out.println("String after removing duplicates = "+r);
    }
}
