import java.util.*;
public class Q84
{
    public static void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string = ");
        String str = sc.nextLine();
        System.out.println("Original string = "+str);
        String up="";
        while(!str.equals("")) 
        {
            char ch=str.charAt(0);
            if(ch>='a'&&ch<='z') 
            {
                ch=(char)(ch-32);
            }
            up=up+ch;
            str=str.substring(1);
        }
        System.out.println("Uppercase string = "+up);
    }
}
