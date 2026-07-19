import java.util.*;
public class Q92
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
        int max=-1;
        char r=' ';
        for(int i=0; i<str.length();i++) 
        {
            char ch=str.charAt(i);
            if(freq[ch]>max) 
            {
                max=freq[ch];
                r=ch;
            }
        }
        System.out.println("Maximum occurring character = "+r);
        System.out.println("Occurrences = "+max);
    }
}
