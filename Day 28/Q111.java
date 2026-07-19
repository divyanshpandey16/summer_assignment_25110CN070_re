import java.util.*;
public class Q111
{
    public static void main(String args[]) 
    {
        int max=100;
        String tids[]=new String[max];
        String n[]=new String[max];
        String mName[]=new String[max];
        double p[]=new double[max];
        int count=0;
        Scanner sc=new Scanner(System.in);
        tids[0]="T001";
        n[0]="Alice Smith";
        mName[0]="Avatar 2";
        p[0]=250.0;
        count++;
        tids[1]="T002";
        n[1]="Bob Martin";
        mName[1]="Inception";
        p[1]=300.0;
        count++;
        while(true) 
        {
            System.out.println("\n--- TICKET SYSTEM ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. View All Tickets");
            System.out.println("3. Search Ticket");
            System.out.println("4. Update Ticket Details");
            System.out.println("5. Cancel Ticket");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1:
                    if(count>=max)
                    {
                        System.out.println("Booking capacity is full!");
                    }
                    else
                    {
                        System.out.print("Enter Ticket ID: = ");
                        String idIn=sc.nextLine();
                        System.out.print("Enter Customer Name = ");
                        String nIn=sc.nextLine();
                        System.out.print("Enter Movie Name = ");
                        String mIn=sc.nextLine();
                        System.out.print("Enter Ticket Price = ");
                        double pIn=sc.nextDouble();
                        sc.nextLine();
                        tids[count]=idIn;
                        n[count]=nIn;
                        mName[count]=mIn;
                        p[count]=pIn;
                        count++;
                        System.out.println("Ticket booked successfully!");
                    }
                    break;
                case 2:
                    if(count==0) 
                    {
                        System.out.println("No tickets found");
                    } 
                    else 
                    {
                        for(int i=0;i<count;i++) 
                        {
                            System.out.println("ID: "+tids[i]+" | Customer: "+n[i]+" | Movie: "+mName[i]+" | Price: Rs."+p[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Ticket ID to search = ");
                    String sId=sc.nextLine();
                    boolean f3=false;
                    for(int i=0;i<count;i++) 
                    {
                        if(tids[i].equals(sId)) 
                        {
                            System.out.println("Found! Customer: "+n[i]+", Movie: "+mName[i]+", Price: Rs."+p[i]);
                            f3=true;
                            break;
                        }
                    }
                    if(f3==false) 
                    {
                        System.out.println("Ticket not found");
                    }
                    break;
                case 4:
                    System.out.print("Enter Ticket ID to update = ");
                    String uId=sc.nextLine();
                    boolean f4=false;
                    for(int i=0;i<count;i++) 
                    {
                        if(tids[i].equals(uId)) 
                        {
                            f4=true;
                            System.out.print("Enter New Customer Name: ");
                            n[i]=sc.nextLine();
                            System.out.print("Enter New Movie Name: ");
                            mName[i]=sc.nextLine();
                            System.out.print("Enter New Ticket Price: ");
                            p[i]=sc.nextDouble();
                            sc.nextLine();
                            System.out.println("Booking details updated!");
                            break;
                        }
                    }
                    if(f4==false) 
                    {
                        System.out.println("Ticket not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter Ticket ID to cancel: ");
                    String cId=sc.nextLine();
                    boolean f5=false;
                    for(int i=0;i<count;i++) 
                    {
                        if(tids[i].equals(cId)) 
                        {
                            for(int j=i;j<count-1;j++)
                            {
                                tids[j]=tids[j+1];
                                n[j]=n[j+1];
                                mName[j]=mName[j+1];
                                p[j]=p[j+1];
                            }
                            count--;
                            System.out.println("Ticket cancelled successfully!");
                            f5=true;
                            break;
                        }
                    }
                    if(f5==false) 
                    {
                        System.out.println("Ticket not found.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose 1 to 6.");
            }
        }
    }
}
