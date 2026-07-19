import java.util.*;
public class Q91
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first string = ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string = ");
        String str2=sc.nextLine();
        str1=str1.replaceAll("\\s", "").toLowerCase();
        str2=str2.replaceAll("\\s", "").toLowerCase();
        boolean f=true;
        if(str1.length()!=str2.length()) 
        {
            f=false;
        } 
        else 
        {
            int freq[]=new int[256];
            for(int i=0;i<str1.length();i++) 
            {
                freq[str1.charAt(i)]++;
                freq[str2.charAt(i)]--;
            }
            for(int i=0;i<256;i++) 
            {
                if(freq[i]!=0) 
                {
                    f=false;
                    break;
                }
            }
        }
        if(f) 
        {
            System.out.println("The strings are anagrams");
        } 
        else 
        {
            System.out.println("The strings are not anagrams");
        }
    }
}
