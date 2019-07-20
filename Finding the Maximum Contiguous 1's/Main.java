
import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=0;
      int a[]=new int[n];
      int i;
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      for(i=0;i<n;i++)
      {
        if(a[i]==0)
        {
          break;
        }
        else
        {
          count++;
        }
      }
      System.out.print(count);
    }
}
