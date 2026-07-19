import java.util.*;
public class Q86
{
    public static void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence = ");
        String str = sc.nextLine();
        System.out.println("Original string = "+str);
        str=str.trim();
        int count=0;
        if(!str.equals(""))
        {
            count=1;
            while(!str.equals(""))
            {
                char ch=str.charAt(0);
                if(ch==' ')
                {
                    count++;
                }
                str=str.substring(1);
            }
        }
        System.out.println("Number of words = "+count);
    }
}