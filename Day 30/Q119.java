import java.util.*;
public class Q119
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter maximum number of employees system can hold: ");
        int max=sc.nextInt();
        sc.nextLine();
        String empid[]=new String[max];
        String empnm[]=new String[max];
        double empsal[]=new double[max];
        int c=0;
        while(true)
        {
            System.out.println("--- Employee Menu ---");
            System.out.println("1. Add New Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Update Employee Salary");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            int choice=sc.nextInt();
            sc.nextLine();
            if(choice==4)
            {
                System.out.println("Exiting System.");
                break;
            }
            switch(choice) 
            {
                case 1:
                    if(c<max)
                    {
                        System.out.print("Enter employee ID: ");
                        empid[c]=sc.nextLine();
                        System.out.print("Enter employee name: ");
                        empnm[c]=sc.nextLine();
                        System.out.print("Enter employee salary: ");
                        empsal[c]=sc.nextDouble();
                        c++;
                        System.out.println("Employee added successfully.");
                    }
                    else
                    {
                        System.out.println("System full! Cannot add more employees.");
                    }
                    break;
                case 2:
                    if(c==0)
                    {
                        System.out.println("System is empty.");
                    }
                    else
                    {
                        System.out.println("ID\tName\tSalary");
                        for(int i=0;i<c;i++)
                        {
                            System.out.println(empid[i]+"\t"+empnm[i]+"\t"+empsal[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter employee ID to update salary: ");
                    String target=sc.nextLine();
                    int f=-1;
                    for(int i=0;i<c;i++)
                    {
                        if(empid[i].equalsIgnoreCase(target))
                        {
                            f=i;
                            break;
                        }
                    }
                    if(f!=-1)
                    {
                        System.out.print("Enter new salary: ");
                        empsal[f]=sc.nextDouble();
                        System.out.println("Salary updated successfully.");
                    }
                    else
                    {
                        System.out.println("Employee not found in system.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice! Please select an option from 1 to 4.");
                    break;
            }
        }
    }
}

