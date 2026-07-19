import java.util.*;
public class Q85
{
    public static void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string = ");
        String str = sc.nextLine();
        System.out.println("Original string = "+str);
        String rev="";
        String temp = str;
        while(!temp.equals("")) 
        {
            char ch=temp.charAt(0);
            rev=ch+rev;
            temp=temp.substring(1);
        }
        if(str.equalsIgnoreCase(rev))
        {
            System.out.println("It is a Palindrome string");
        }
        else
        {
            System.out.println("It is not a Palindrome string");
        }
    }
}