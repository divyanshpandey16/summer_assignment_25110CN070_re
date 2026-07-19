import java.util.*;
public class Q98
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first string = ");
        String str1=sc.nextLine();
        System.out.print("Enter second string = ");
        String str2=sc.nextLine();
        int c1[]=new int[26];
        int c2[]=new int[26];
        for(int i=0;i<str1.length();i++) 
        {
            char ch=str1.charAt(i);
            if(ch>='a'&&ch<='z') 
            c1[ch-'a']++;
        }
        for(int i=0;i<str2.length();i++) 
        {
            char ch=str2.charAt(i);
            if(ch>='a'&&ch<='z')
            c2[ch-'a']++;
        }
        String r="";
        for(int i=0;i<26;i++) 
        {
            int c=Math.min(c1[i], c2[i]);
            while(c>0) 
            {
                r=r+(char)(i+'a');
                c--;
            }
        }
        System.out.println("Common characters = "+r);
    }
}
