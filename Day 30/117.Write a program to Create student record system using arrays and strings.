import java.util.*;
public class Q117
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter maximum number of students system can hold: ");
        int max=sc.nextInt();
        sc.nextLine();
        String stid[]=new String[max];
        String stnm[]=new String[max];
        String stgr[]=new String[max];
        int c=0;
        while(true)
        {
            System.out.println("--- Student Menu ---");
            System.out.println("1. Add New Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Update Student Grade");
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
                        System.out.print("Enter student ID: ");
                        stid[c]=sc.nextLine();
                        System.out.print("Enter student name: ");
                        stnm[c]=sc.nextLine();
                        System.out.print("Enter student grade: ");
                        stgr[c]=sc.nextLine();
                        c++;
                        System.out.println("Student added successfully.");
                    }
                    else
                    {
                        System.out.println("System full! Cannot add more students.");
                    }
                    break;
                case 2:
                    if(c==0)
                    {
                        System.out.println("System is empty.");
                    }
                    else
                    {
                        System.out.println("ID\tName\tGrade");
                        for(int i=0;i<c;i++)
                        {
                            System.out.println(stid[i]+"\t"+stnm[i]+"\t"+stgr[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter student ID to update grade: ");
                    String target=sc.nextLine();
                    int f=-1;
                    for(int i=0;i<c;i++)
                    {
                        if(stid[i].equalsIgnoreCase(target))
                        {
                            f=i;
                            break;
                        }
                    }
                    if(f!=-1)
                    {
                        System.out.print("Enter new grade: ");
                        stgr[f]=sc.nextLine();
                        System.out.println("Grade updated successfully.");
                    }
                    else
                    {
                        System.out.println("Student not found in system.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice! Please select an option from 1 to 4.");
                    break;
            }
        }
    }
}
