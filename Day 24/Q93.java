import java.util.*;
public class Q93
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the original string = ");
        String str1 = sc.nextLine();
        System.out.print("Enter the rotated string to check = ");
        String str2 = sc.nextLine();
        System.out.println("Original string = " + str1);
        System.out.println("Rotated string to check = " + str2);
        boolean f=false;
        if(str1.length()==str2.length()&&str1.length()>0) 
        {
            String str3=str1+str1;
            if(str3.contains(str2)) 
            {
                f=true;
            }
        }
        if(f) 
        {
            System.out.println("\""+str2+"\"is a valid rotation of \""+str1+"\"");
        } 
        else 
        {
            System.out.println("\""+str2+"\" is NOT a rotation of \""+str1+"\"");
        }
    }
}
