import java.util.*;
public class Q116
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter maximum number of items your inventory can hold: ");
        int max=sc.nextInt();
        sc.nextLine();
        String nm[]=new String[max];
        int qty[]=new int[max];
        double pr[]=new double[max];
        int c=0;
        while(true)
        {
            System.out.println("--- Inventory Menu ---");
            System.out.println("1. Add New Item");
            System.out.println("2. Display All Items");
            System.out.println("3. Update Item Quantity");
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
                        System.out.print("Enter item name: ");
                        nm[c]=sc.nextLine();
                        System.out.print("Enter item quantity: ");
                        qty[c]=sc.nextInt();
                        System.out.print("Enter item price: ");
                        pr[c]=sc.nextDouble();
                        c++;
                        System.out.println("Item added successfully.");
                    }
                    else
                    {
                        System.out.println("Inventory full! Cannot add more items.");
                    }
                    break;
                case 2:
                    if(c==0)
                    {
                        System.out.println("Inventory is empty.");
                    }
                    else
                    {
                        System.out.println("Name\tQuantity\tPrice");
                        for(int i=0;i<c;i++)
                        {
                            System.out.println(nm[i]+"\t"+qty[i]+"\t\t"+pr[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter item name to update: ");
                    String target=sc.nextLine();
                    int f=-1;
                    for(int i=0;i<c;i++)
                    {
                        if(nm[i].equalsIgnoreCase(target))
                        {
                            f=i;
                            break;
                        }
                    }
                    if(f!=-1)
                    {
                        System.out.print("Enter new quantity: ");
                        qty[f]=sc.nextInt();
                        System.out.println("Quantity updated successfully.");
                    }
                    else
                    {
                        System.out.println("Item not found in inventory.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice! Please select an option from 1 to 4.");
                    break;
            }
        }
    }
}

