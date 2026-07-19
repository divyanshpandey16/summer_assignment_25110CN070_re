import java.util.*;
public class Q101
{
    public static void main() {
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        int n=rd.nextInt(100)+1;
        int c=0;
        System.out.println("Guess a number between 1 and 100 = ");
        while(c<6)
        {
            System.out.print("Enter your guess = ");
            int g=sc.nextInt();
            c++;
            if(g==n)
            {
             System.out.println("Correct! You won");
             return;
            } 
            else if(g<n)
            {
             System.out.println("Too low!");
            } else
            {
             System.out.println("Too high!");
            }
        }
        System.out.println("Game Over! The number was "+n);
    }
}