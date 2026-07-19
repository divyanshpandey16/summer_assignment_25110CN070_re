import java.util.*;
public class Q100
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence = ");
        String str=sc.nextLine();
        String arr[]=str.split(" ");
        int n=arr.length;
        for(int i=0;i<n-1;i++) 
        {
            for(int j=0;j<n-i-1;j++) 
            {
                if(arr[j].length()>arr[j+1].length()) 
                {
                    String t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        String r="";
        for(int i=0;i<n;i++) 
        {
            r=r+arr[i]+" ";
        }
        System.out.println("Sorted sentence = "+r.trim());
    }
}
