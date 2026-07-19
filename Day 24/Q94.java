import java.util.*;
public class Q94
{
    public static void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string = ");
        String str = sc.nextLine();
        System.out.println("Original string = "+str);
        String str2="";
        int c=1;
        for(int i=0;i<str.length();i++) 
        {
            if(i+1<str.length()&&str.charAt(i)==str.charAt(i+1)) 
            {
                c++;
            } 
            else 
            {
                str2=str2+str.charAt(i)+""+c;
                c=1;
            }
        }
        if(str2.length()<str.length()) 
        {
            System.out.println("Compressed string = "+str2);
        } 
        else 
        {
            System.out.println("Compressed string = "+str);
        }
    }
}
