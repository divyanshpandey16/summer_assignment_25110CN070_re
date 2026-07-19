import java.util.*;
public class Q83
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string = ");
        String str=sc.nextLine();
        System.out.println("Original string = "+str);
        int vow=0;
        int con=0;
        str=str.toLowerCase();
        while(!str.equals("")) 
        {
            char ch=str.charAt(0);
            if(ch>='a'&&ch<='z') 
            {
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
                {
                    vow++;
                } 
                else 
                {
                    con++;
                }
            }
            str=str.substring(1);
        }
        System.out.println("Total Vowels = "+vow);
        System.out.println("Total Consonants = "+con);
    }
}