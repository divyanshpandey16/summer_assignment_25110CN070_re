import java.util.*;
public class Q113
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("--- Calculator Menu ---");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
        int choice=sc.nextInt();
        System.out.print("Enter first number: ");
        double num1=sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2=sc.nextDouble();
        switch(choice) 
        {
            case 1:
                double sum=num1+num2;
                System.out.println("Result: "+sum);
                break;
            case 2:
                double diff=num1-num2;
                System.out.println("Result: "+diff);
                break;
            case 3:
                double pro=num1*num2;
                System.out.println("Result: "+pro);
                break;
            case 4:
                if(num2==0) 
                {
                    System.out.println("Error: Cannot divide by zero.");
                } 
                else 
                {
                    double div=num1/num2;
                    System.out.println("Result: "+div);
                }
                break;
            default:
                System.out.println("Invalid choice! Please select an option from 1 to 4.");
                break;
        }
    }
}
