import java.util.*;
public class Q90
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string = ");
        String str = sc.nextLine();
        System.out.println("Original string = "+str);
        int freq[]=new int[256];
        for(int i=0;i<str.length();i++) 
        {
            char ch=str.charAt(i);
            freq[ch]++;
        }
        char r=' '; 
        boolean f=false;
        for(int i=0;i<str.length();i++) 
        {
            char ch=str.charAt(i);
            if(freq[ch]>1) 
            {
                r=ch;
                f=true;
                break;
            }
        }
        if(f) 
        {
            System.out.println("First repeating character = " +r);
        } 
        else 
        {
            System.out.println("No repeating characters found or the string is empty");
        }
    }
}