import java.util.*;
public class Q115
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        System.out.println("--- String Menu ---");
        System.out.println("1. Find Length of String");
        System.out.println("2. Convert to Uppercase and Lowercase");
        System.out.println("3. Reverse the String");
        System.out.println("4. Count Vowels and Consonants");
        System.out.print("Enter your choice (1-4): ");
        int choice=sc.nextInt();
        switch(choice) 
        {
            case 1:
                int len=str.length();
                System.out.println("Length: "+len);
                break;
            case 2:
                String upper=str.toUpperCase();
                String lower=str.toLowerCase();
                System.out.println("Uppercase: "+upper);
                System.out.println("Lowercase: "+lower);
                break;
            case 3:
                String rev="";
                for(int i=str.length()-1;i>=0;i--)
                {
                    rev=rev+str.charAt(i);
                }
                System.out.println("Reversed String: "+rev);
                break;
            case 4:
                int v=0,c=0;
                String check=str.toLowerCase();
                for(int i=0;i<check.length();i++)
                {
                    char ch=check.charAt(i);
                    if(ch>='a'&&ch<='z')
                    {
                        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                        {
                            v++;
                        }
                        else
                        {
                            c++;
                        }
                    }
                }
                System.out.println("Vowels: "+v);
                System.out.println("Consonants: "+c);
                break;
            default:
                System.out.println("Invalid choice! Please select an option from 1 to 4.");
                break;
        }
    }
}

