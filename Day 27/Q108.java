import java.util.ArrayList;
import java.util.*;
class Marksheet 
{
    String rollno;
    String name;
    int sub1;
    int sub2;
    int sub3;
    public Marksheet(String rollno,String name,int sub1,int sub2,int sub3) 
    {
        this.rollno=rollno;
        this.name=name;
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
    }
}
public class Q108
{
    public static void main(String[] args) 
    {
        ArrayList<Marksheet> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while(true) 
        {
            System.out.println("\n--- MARKSHEET SYSTEM ---");
            System.out.println("1. Add Student Marks");
            System.out.println("2. View All Marksheets");
            System.out.println("3. Search Marksheet");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Marksheet");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice=sc.nextInt();
            sc.nextLine();
            if(choice==1) 
            {
                System.out.print("Enter Roll No: = ");
                String rollno=sc.nextLine();
                System.out.print("Enter Name = ");
                String name=sc.nextLine();
                System.out.print("Enter Subject 1 Marks = ");
                int sub1=sc.nextInt();
                System.out.print("Enter Subject 2 Marks = ");
                int sub2=sc.nextInt();
                System.out.print("Enter Subject 3 Marks = ");
                int sub3=sc.nextInt();
                sc.nextLine();
                Marksheet m=new Marksheet(rollno,name,sub1,sub2,sub3);
                list.add(m);
                System.out.println("Marks added!");
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
                        Marksheet m=list.get(i);
                        int total=m.sub1+m.sub2+m.sub3;
                        double per=total/3.0;
                        System.out.println("Roll No: "+m.rollno+" | Name: "+m.name+" | Sub1: "+m.sub1+" | Sub2: "+m.sub2+" | Sub3: "+m.sub3+" | Total: "+total+" | Percentage: "+per+"%");
                    }
                }
            }
            else if(choice==3) 
            {
                System.out.print("Enter Roll No to search = ");
                String searchRoll=sc.nextLine();
                boolean f=false;
                for(int i=0;i<list.size();i++) 
                {
                    Marksheet m=list.get(i);
                    if(m.rollno.equals(searchRoll)) 
                    {
                        int total=m.sub1+m.sub2+m.sub3;
                        double per=total/3.0;
                        System.out.println("Found! Name: "+m.name+", Sub1:"+m.sub1+", Sub2: "+m.sub2+", Sub3: "+m.sub3+", Total: "+total+", Percentage: "+per+"%");
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
                System.out.print("Enter Roll No to update = ");
                String updateRoll=sc.nextLine();
                boolean f=false;
                for(int i=0;i<list.size();i++) 
                {
                    Marksheet m=list.get(i);
                    if(m.rollno.equals(updateRoll)) 
                    {
                        System.out.print("Enter New Name: ");
                        m.name=sc.nextLine();
                        System.out.print("Enter New Subject 1 Marks: ");
                        m.sub1=sc.nextInt();
                        System.out.print("Enter New Subject 2 Marks: ");
                        m.sub2=sc.nextInt();
                        System.out.print("Enter New Subject 3 Marks: ");
                        m.sub3=sc.nextInt();
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
                System.out.print("Enter Roll No to delete: ");
                String deleteRoll=sc.nextLine();
                boolean f=false;
                for(int i=0;i<list.size();i++) 
                {
                    Marksheet m=list.get(i);
                    if(m.rollno.equals(deleteRoll)) 
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

