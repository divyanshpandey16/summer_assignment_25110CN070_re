import java.util.*;
public class Q109
{
    public static void main(String args[]) 
    {
        int max=100;
        String ids[]=new String[max];
        String t[]=new String[max];
        String a[]=new String[max];
        String st[]=new String[max];
        int count=0;
        Scanner sc=new Scanner(System.in);
        ids[0]="B001";
        t[0]="Effective Java";
        a[0]="Joshua Bloch";
        st[0]="Available";
        count++;
        ids[1]="B002";
        t[1]="Clean Code";
        a[1]="Robert Martin";
        st[1]="Available";
        count++;
        while(true) 
        {
            System.out.println("\n--- LIBRARY SYSTEM ---");
            System.out.println("1. Add New Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue / Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Delete Book");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1:
                    if(count>=max)
                    {
                        System.out.println("Library is full! Cannot add more books.");
                    }
                    else
                    {
                        System.out.print("Enter Book ID: = ");
                        String idIn=sc.nextLine();
                        System.out.print("Enter Title = ");
                        String tIn=sc.nextLine();
                        System.out.print("Enter Author = ");
                        String aIn=sc.nextLine();
                        ids[count]=idIn;
                        t[count]=tIn;
                        a[count]=aIn;
                        st[count]="Available";
                        count++;
                        System.out.println("Book added successfully!");
                    }
                    break;
                case 2:
                    if(count==0) 
                    {
                        System.out.println("No books found in the library");
                    } 
                    else 
                    {
                        for(int i=0;i<count;i++) 
                        {
                            System.out.println("ID: "+ids[i]+" | Title: "+t[i]+" | Author: "+a[i]+" | Status: "+st[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Book ID to search = ");
                    String sId=sc.nextLine();
                    boolean f3=false;
                    for(int i=0;i<count;i++) 
                    {
                        if(ids[i].equals(sId)) 
                        {
                            System.out.println("Found! Title: "+t[i]+", Author: "+a[i]+", Status: "+st[i]);
                            f3=true;
                            break;
                        }
                    }
                    if(f3==false) 
                    {
                        System.out.println("Book not found");
                    }
                    break;
                case 4:
                    System.out.print("Enter Book ID to borrow = ");
                    String bId=sc.nextLine();
                    boolean f4=false;
                    for(int i=0;i<count;i++) 
                    {
                        if(ids[i].equals(bId)) 
                        {
                            f4=true;
                            if(st[i].equals("Available")) 
                            {
                                st[i]="Borrowed";
                                System.out.println("Book issued successfully!");
                            } 
                            else 
                            {
                                System.out.println("Book is already borrowed by someone else.");
                            }
                            break;
                        }
                    }
                    if(f4==false) 
                    {
                        System.out.println("Book not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter Book ID to return: ");
                    String rId=sc.nextLine();
                    boolean f5=false;
                    for(int i=0;i<count;i++) 
                    {
                        if(ids[i].equals(rId)) 
                        {
                            f5=true;
                            if(st[i].equals("Borrowed")) 
                            {
                                st[i]="Available";
                                System.out.println("Book returned successfully!");
                            } 
                            else 
                            {
                                System.out.println("This book was not borrowed.");
                            }
                            break;
                        }
                    }
                    if(f5==false) 
                    {
                        System.out.println("Book not found.");
                    }
                    break;
                case 6:
                    System.out.print("Enter Book ID to delete: ");
                    String dId=sc.nextLine();
                    boolean f6=false;
                    for(int i=0;i<count;i++) 
                    {
                        if(ids[i].equals(dId)) 
                        {
                            for(int j=i;j<count-1;j++)
                            {
                                ids[j]=ids[j+1];
                                t[j]=t[j+1];
                                a[j]=a[j+1];
                                st[j]=st[j+1];
                            }
                            count--;
                            System.out.println("Book deleted from records!");
                            f6=true;
                            break;
                        }
                    }
                    if(f6==false) 
                    {
                        System.out.println("Book not found.");
                    }
                    break;
                case 7:
                    System.out.println("Exiting program.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose 1 to 7.");
            }
        }
    }
}

