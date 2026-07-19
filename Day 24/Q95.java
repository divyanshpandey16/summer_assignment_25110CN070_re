import java.util.*;
public class Q95
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence = ");
        String str=sc.nextLine();
        System.out.println("Original sentence = "+str);
        String w[]=str.split(" ");
        String str2="";
        for(int i=0;i<w.length;i++) 
        {
            if(w[i].length()>str2.length()) 
            {
                str2=w[i];
            }
        }
        System.out.println("Longest word = "+str2);
        System.out.println("Length = " +str2.length());
    }
}