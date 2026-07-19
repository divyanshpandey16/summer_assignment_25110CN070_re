import java.util.ArrayList;
import java.util.*;
class Salary 
{
    String empid;
    String empname;
    double basicsalary;
    double allowance;
    public Salary(String empid,String empname,double basicsalary,double allowance) 
    {
        this.empid=empid;
        this.empname=empname;
        this.basicsalary=basicsalary;
        this.allowance=allowance;
    }
}
public class Q107
{
    public static void main(String[] args) 
    {
        ArrayList<Salary> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while(true) 
        {
            System.out.println("\n--- SALARY SYSTEM ---");
            System.out.println("1. Add Salary Record");
            System.out.println("2. View All Salaries");
            System.out.println("3. Search Salary");
            System.out.println("4. Update Salary");
            System.out.println("5. Delete Salary Record");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice=sc.nextInt();
            sc.nextLine();
            if(choice==1) 
            {
                System.out.print("Enter ID: = ");
                String empid=sc.nextLine();
                System.out.print("Enter Name = ");
                String empname=sc.nextLine();
                System.out.print("Enter Basic Salary = ");
                double basicsalary=sc.nextDouble();
                System.out.print("Enter Allowance = ");
                double allowance=sc.nextDouble();
                sc.nextLine();
                Salary s=new Salary(empid,empname,basicsalary,allowance);
                list.add(s);
                System.out.println("Salary added!");
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
                        Salary s=list.get(i);
                        double total=s.basicsalary+s.allowance;
                        System.out.println("ID: "+s.empid+" | Name: "+s.empname+" | Basic: "+s.basicsalary+" | Allowance: "+s.allowance+" | Total: "+total);
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
                    Salary s=list.get(i);
                    if(s.empid.equals(searchId)) 
                    {
                        double total=s.basicsalary+s.allowance;
                        System.out.println("Found! Name: "+s.empname+", Basic:"+s.basicsalary+", Allowance: "+s.allowance+", Total: "+total);
                        f=true;
                        break;
                    }
                }
                if(f==false) 
                {
                    System.out.println("Record not found");
                }
            }
            else if(choice==4) 
            {
                System.out.print("Enter ID to update = ");
                String updateId=sc.nextLine();
                boolean f=false;
                for(int i=0;i<list.size();i++) 
                {
                    Salary s=list.get(i);
                    if(s.empid.equals(updateId)) 
                    {
                        System.out.print("Enter New Name: ");
                        s.empname=sc.nextLine();
                        System.out.print("Enter New Basic Salary: ");
                        s.basicsalary=sc.nextDouble();
                        System.out.print("Enter New Allowance: ");
                        s.allowance=sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Record updated!");
                        f=true;
                        break;
                    }
                }
                if(f==false) 
                {
                    System.out.println("Record not found.");
                }
            }
            else if(choice==5) 
            {
                System.out.print("Enter ID to delete: ");
                String deleteId=sc.nextLine();
                boolean f=false;
                for(int i=0;i<list.size();i++) 
                {
                    Salary s=list.get(i);
                    if(s.empid.equals(deleteId)) 
                    {
                        list.remove(i);
                        System.out.println("Record deleted!");
                        f=true;
                        break;
                    }
                }
                if(f==false) 
                {
                    System.out.println("Record not found.");
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
