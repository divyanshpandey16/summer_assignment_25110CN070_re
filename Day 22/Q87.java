import java.util.*;
public class Q87
{
    public static void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string = ");
        String str = sc.nextLine();
        System.out.println("Original string = "+str);
        str = str.toUpperCase();
        while(!str.equals(""))
        {
            char ch=str.charAt(0);
            int count=0;
            String temp ="";
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)==ch)
                {
                    count++;
                }
                else
                {
                    temp=temp+str.charAt(i);
                }
            }
            System.out.println("Frequency of "+ch+" = "+count);
            str = temp;
        }
    }
}