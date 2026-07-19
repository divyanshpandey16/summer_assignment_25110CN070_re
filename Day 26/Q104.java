import java.util.*;
public class Q104
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int score=0;
        
        System.out.println("--- WELCOME TO THE QUIZ ---");
        
        System.out.println("\nQ1. What is the size of int data type in Java?");
        System.out.println("1. 2 bytes\n2. 4 bytes\n3. 8 bytes\n4. 1 byte");
        System.out.print("Enter your answer = ");
        int ans1=sc.nextInt();
        if(ans1==2)
        {
            System.out.println("Correct!");
            score++;
        }
        else
        {
            System.out.println("Wrong! Correct answer is 2.");
        }
        
        System.out.println("\nQ2. Which keyword is used to create an object in Java?");
        System.out.println("1. class\n2. public\n3. new\n4. void");
        System.out.print("Enter your answer = ");
        int ans2=sc.nextInt();
        if(ans2==3)
        {
            System.out.println("Correct!");
            score++;
        }
        else
        {
            System.out.println("Wrong! Correct answer is 3.");
        }
        
        System.out.println("\nQ3. Which extension is used to save Java source code files?");
        System.out.println("1. .class\n2. .txt\n3. .exe\n4. .java");
        System.out.print("Enter your answer = ");
        int ans3=sc.nextInt();
        if(ans3==4)
        {
            System.out.println("Correct!");
            score++;
        }
        else
        {
            System.out.println("Wrong! Correct answer is 4.");
        }
        
        System.out.println("\n--- QUIZ OVER ---");
        System.out.println("Your Final Score = "+score+"/3");
    }
}