import java.util.ArrayList;
import java.util.*;
class Employee 
{
    String id;
    String name;
    String designation;
    double salary;
    public Employee(String id,String name,String designation,double salary) 
    {
        this.id=id;
        this.name=name;
        this.designation=designation;
        this.salary=salary;
    }
}
public class Q106
{
    public static void main() 
    {
        ArrayList<Employee> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while(true) 
        {
            System.out.println("\n--- EMPLOYEE SYSTEM ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice=sc.nextInt();
            sc.nextLine();
            if(choice==1) 
            {
                System.out.print("Enter ID: = ");
                String id=sc.nextLine();
                System.out.print("Enter Name = ");
                String name=sc.nextLine();
                System.out.print("Enter Designation = ");
                String designation=sc.nextLine();
                System.out.print("Enter Salary = ");
                double salary=sc.nextDouble();
                sc.nextLine();
                Employee e=new Employee(id,name,designation,salary);
                list.add(e);
                System.out.println("Employee added!");
            }
            else if(choice==2) 
            {
                if(list.isEmpty()) 
                {
                    System.out.println("No records found");
                } 
                else 
                {
                    for(int i=0;i<list.size();i++) 
                    {
                        Employee e=list.get(i);
                        System.out.println("ID: "+e.id+" | Name: "+e.name+" | Designation: "+e.designation+" | Salary: "+e.salary);
                    }
                }
            }
            else if(choice==3) 
            {
                System.out.print("Enter ID to search = ");
                String searchId=sc.nextLine();
                boolean f=false;
                for(int i=0;i<list.size();i++) 
                {
                    Employee e=list.get(i);
                    if(e.id.equals(searchId)) 
                    {
                        System.out.println("Found! Name: "+e.name+", Designation:"+e.designation+", Salary: "+e.salary);
                        f=true;
                        break;
                    }
                }
                if(f==false) 
                {
                    System.out.println("Employee not found");
                }
            }
            else if(choice==4) 
            {
                System.out.print("Enter ID to update = ");
                String updateId=sc.nextLine();
                boolean f=false;
                for(int i=0;i<list.size();i++) 
                {
                    Employee e=list.get(i);
                    if(e.id.equals(updateId)) 
                    {
                        System.out.print("Enter New Name: ");
                        e.name=sc.nextLine();
                        System.out.print("Enter New Designation: ");
                        e.designation=sc.nextLine();
                        System.out.print("Enter New Salary: ");
                        e.salary=sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Record updated!");
                        f=true;
                        break;
                    }
                }
                if(f==false) 
                {
                    System.out.println("Employee not found.");
                }
            }
            else if(choice==5) 
            {
                System.out.print("Enter ID to delete: ");
                String deleteId=sc.nextLine();
                boolean f=false;
                for(int i=0;i<list.size();i++) 
                {
                    Employee e=list.get(i);
                    if(e.id.equals(deleteId)) 
                    {
                        list.remove(i);
                        System.out.println("Employee deleted!");
                        f=true;
                        break;
                    }
                }
                if(f==false) 
                {
                    System.out.println("Employee not found.");
                }
            }
            else if(choice==6) 
            {
                System.out.println("Exiting program.");
                break;
            } 
            else 
            {
                System.out.println("Invalid choice. Please choose 1 to 6.");
            }
        }
    }
}

