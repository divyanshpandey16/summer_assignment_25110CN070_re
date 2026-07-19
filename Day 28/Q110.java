import java.util.*;
public class Q110
{
    public static void main(String args[]) 
    {
        int max=100;
        String accs[]=new String[max];
        String n[]=new String[max];
        double bal[]=new double[max];
        int count=0;
        Scanner sc=new Scanner(System.in);
        accs[0]="A001";
        n[0]="Alice Smith";
        bal[0]=5000.0;
        count++;
        accs[1]="A002";
        n[1]="Bob Martin";
        bal[1]=2500.0;
        count++;
        while(true) 
        {
            System.out.println("\n--- BANK SYSTEM ---");
            System.out.println("1. Create Account");
            System.out.println("2. View All Accounts");
            System.out.println("3. Check Balance");
            System.out.println("4. Deposit Money");
            System.out.println("5. Withdraw Money");
            System.out.println("6. Close Account");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1:
                    if(count>=max)
                    {
                        System.out.println("Bank database is full!");
                    }
                    else
                    {
                        System.out.print("Enter Account No: = ");
                        String accIn=sc.nextLine();
                        System.out.print("Enter Name = ");
                        String nIn=sc.nextLine();
                        System.out.print("Enter Initial Deposit = ");
                        double balIn=sc.nextDouble();
                        sc.nextLine();
                        accs[count]=accIn;
                        n[count]=nIn;
                        bal[count]=balIn;
                        count++;
                        System.out.println("Account created successfully!");
                    }
                    break;
                case 2:
                    if(count==0) 
                    {
                        System.out.println("No accounts found");
                    } 
                    else 
                    {
                        for(int i=0;i<count;i++) 
                        {
                            System.out.println("Acc No: "+accs[i]+" | Name: "+n[i]+" | Balance: Rs."+bal[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Account No to check = ");
                    String sAcc=sc.nextLine();
                    boolean f3=false;
                    for(int i=0;i<count;i++) 
                    {
                        if(accs[i].equals(sAcc)) 
                        {
                            System.out.println("Found! Name: "+n[i]+", Balance: Rs."+bal[i]);
                            f3=true;
                            break;
                        }
                    }
                    if(f3==false) 
                    {
                        System.out.println("Account not found");
                    }
                    break;
                case 4:
                    System.out.print("Enter Account No to deposit = ");
                    String dAcc=sc.nextLine();
                    boolean f4=false;
                    for(int i=0;i<count;i++) 
                    {
                        if(accs[i].equals(dAcc)) 
                        {
                            f4=true;
                            System.out.print("Enter Deposit Amount: ");
                            double amt=sc.nextDouble();
                            sc.nextLine();
                            if(amt>0)
                            {
                                bal[i]=bal[i]+amt;
                                System.out.println("Deposit successful! New Balance: Rs."+bal[i]);
                            }
                            else
                            {
                                System.out.println("Invalid amount.");
                            }
                            break;
                        }
                    }
                    if(f4==false) 
                    {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter Account No to withdraw: ");
                    String wAcc=sc.nextLine();
                    boolean f5=false;
                    for(int i=0;i<count;i++) 
                    {
                        if(accs[i].equals(wAcc)) 
                        {
                            f5=true;
                            System.out.print("Enter Withdrawal Amount: ");
                            double amt=sc.nextDouble();
                            sc.nextLine();
                            if(amt>0 && amt<=bal[i])
                            {
                                bal[i]=bal[i]-amt;
                                System.out.println("Withdrawal successful! New Balance: Rs."+bal[i]);
                            }
                            else
                            {
                                System.out.println("Invalid amount or insufficient balance.");
                            }
                            break;
                        }
                    }
                    if(f5==false) 
                    {
                        System.out.println("Account not found.");
                    }
                    break;
                case 6:
                    System.out.print("Enter Account No to close: ");
                    String cAcc=sc.nextLine();
                    boolean f6=false;
                    for(int i=0;i<count;i++) 
                    {
                        if(accs[i].equals(cAcc)) 
                        {
                            for(int j=i;j<count-1;j++)
                            {
                                accs[j]=accs[j+1];
                                n[j]=n[j+1];
                                bal[j]=bal[j+1];
                            }
                            count--;
                            System.out.println("Account closed and deleted!");
                            f6=true;
                            break;
                        }
                    }
                    if(f6==false) 
                    {
                        System.out.println("Account not found.");
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

