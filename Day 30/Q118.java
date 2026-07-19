import java.util.*;
public class Q118
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter maximum number of books library can hold: ");
        int max=sc.nextInt();
        sc.nextLine();
        String bkid[]=new String[max];
        String bktl[]=new String[max];
        String bkauth[]=new String[max];
        int c=0;
        while(true)
        {
            System.out.println("--- Library Menu ---");
            System.out.println("1. Add New Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book by ID");
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
                        System.out.print("Enter book ID: ");
                        bkid[c]=sc.nextLine();
                        System.out.print("Enter book title: ");
                        bktl[c]=sc.nextLine();
                        System.out.print("Enter book author: ");
                        bkauth[c]=sc.nextLine();
                        c++;
                        System.out.println("Book added successfully.");
                    }
                    else
                    {
                        System.out.println("Library full! Cannot add more books.");
                    }
                    break;
                case 2:
                    if(c==0)
                    {
                        System.out.println("Library is empty.");
                    }
                    else
                    {
                        System.out.println("ID\tTitle\tAuthor");
                        for(int i=0;i<c;i++)
                        {
                            System.out.println(bkid[i]+"\t"+bktl[i]+"\t"+bkauth[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter book ID to search: ");
                    String target=sc.nextLine();
                    int f=-1;
                    for(int i=0;i<c;i++)
                    {
                        if(bkid[i].equalsIgnoreCase(target))
                        {
                            f=i;
                            break;
                        }
                    }
                    if(f!=-1)
                    {
                        System.out.println("Book Found: Title: "+bktl[f]+", Author: "+bkauth[f]);
                    }
                    else
                    {
                        System.out.println("Book not found in library.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice! Please select an option from 1 to 4.");
                    break;
            }
        }
    }
}

