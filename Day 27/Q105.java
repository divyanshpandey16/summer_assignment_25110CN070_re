import java.util.ArrayList;
import java.util.*;
class Student 
{
    String id;
    String name;
    int age;
    double gpa;
    public Student(String id, String name, int age, double gpa) 
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
}
public class Q105
{
    public static void main(String[] args) 
    {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while(true) 
        {
            System.out.println("\n--- STUDENT SYSTEM ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
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
                System.out.print("Enter Age = ");
                int age=sc.nextInt();
                System.out.print("Enter GPA = ");
                double gpa=sc.nextDouble();
                sc.nextLine();
                Student s=new Student(id, name, age, gpa);
                list.add(s);
                System.out.println("Student added!");
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
                        Student s=list.get(i);
                        System.out.println("ID: "+s.id+" | Name: "+s.name+" | Age: "+s.age+" | SGPA: "+s.gpa);
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
                    Student s=list.get(i);
                    if(s.id.equals(searchId)) 
                    {
                        System.out.println("Found! Name: "+s.name+", Age:"+s.age+", SGPA: "+s.gpa);
                        f=true;
                        break;
                    }
                }
                if(f==false) 
                {
                    System.out.println("Student not found");
                }
            }
            else if(choice==4) 
            {
                System.out.print("Enter ID to update = ");
                String updateId=sc.nextLine();
                boolean f=false;
                for(int i= 0;i<list.size();i++) 
                {
                    Student s=list.get(i);
                    if(s.id.equals(updateId)) 
                    {
                        System.out.print("Enter New Name: ");
                        s.name = sc.nextLine();
                        System.out.print("Enter New Age: ");
                        s.age = sc.nextInt();
                        System.out.print("Enter New SGPA: ");
                        s.gpa = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Record updated!");
                        f=true;
                        break;
                    }
                }
                if(f==false) 
                {
                    System.out.println("Student not found.");
                }
            }
            else if(choice==5) 
            {
                System.out.print("Enter ID to delete: ");
                String deleteId=sc.nextLine();
                boolean f=false;
                for(int i=0;i<list.size();i++) 
                {
                    Student s=list.get(i);
                    if(s.id.equals(deleteId)) 
                    {
                        list.remove(i);
                        System.out.println("Student deleted!");
                        f=true;
                        break;
                    }
                }
                if(f==false) 
                {
                    System.out.println("Student not found.");
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

