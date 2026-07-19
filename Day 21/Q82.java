import java.util.*;
public class Q82
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string = ");
        String str=sc.nextLine();    
        System.out.println("Original string = "+str);
        String rev="";
        while (!str.equals("")) 
        {
            char ch=str.charAt(0);
            rev=ch+rev;
            str=str.substring(1);
        }
        System.out.println("Reversed string = "+rev);
    }
}
