import java.util.*;
public class Q120
{
    static Scanner sc=new Scanner(System.in);
    static int max,c=0;
    static String tmid[];
    static String tmname[];
    static int played[];
    static int points[];
    public static void main() 
    {
        System.out.print("Enter maximum number of teams in tournament: ");
        max=sc.nextInt();
        sc.nextLine();
        tmid=new String[max];
        tmname=new String[max];
        played=new int[max];
        points=new int[max];
        while(true)
        {
            System.out.println("--- Tournament Menu ---");
            System.out.println("1. Register New Team");
            System.out.println("2. Display Leaderboard");
            System.out.println("3. Record Match Result");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int ch=sc.nextInt();
            sc.nextLine();
            if(ch==4)
            {
                System.out.println("Exiting System.");
                break;
            }
            switch(ch) 
            {
                case 1:
                    registerTeam();
                    break;
                case 2:
                    displayLeaderboard();
                    break;
                case 3:
                    recordMatch();
                    break;
                default:
                    System.out.println("Invalid selection!");
                    break;
            }
        }
    }
    public static void registerTeam()
    {
        if(c<max)
        {
            System.out.print("Enter Team ID: ");
            tmid[c]=sc.nextLine();
            System.out.print("Enter Team Name: ");
            tmname[c]=sc.nextLine();
            played[c]=0;
            points[c]=0;
            c++;
            System.out.println("Team registered successfully.");
        }
        else
        {
            System.out.println("Tournament roster is full!");
        }
    }
    public static void displayLeaderboard()
    {
        if(c==0)
        {
            System.out.println("No teams registered yet.");
        }
        else
        {
            System.out.println("ID\tTeam Name\tPlayed\tPoints");
            for(int i=0;i<c;i++)
            {
                System.out.println(tmid[i]+"\t"+tmname[i]+"\t"+played[i]+"\t"+points[i]);
            }
        }
    }
    public static void recordMatch()
    {
        System.out.print("Enter Winning Team ID: ");
        String winid=sc.nextLine();
        System.out.print("Enter Losing Team ID: ");
        String loseid=sc.nextLine();
        int fwin=-1,flose=-1;
        for(int i=0;i<c;i++)
        {
            if(tmid[i].equalsIgnoreCase(winid))
            {
                fwin=i;
            }
            if(tmid[i].equalsIgnoreCase(loseid))
            {
                flose=i;
            }
        }
        if(fwin!=-1&&flose!=-1)
        {
            played[fwin]=played[fwin]+1;
            played[flose]=played[flose]+1;
            points[fwin]=points[fwin]+3;
            System.out.println("Match recorded successfully! 3 points added to "+tmname[fwin]);
        }
        else
        {
            System.out.println("Error: One or both Team IDs not found.");
        }
    }
}

