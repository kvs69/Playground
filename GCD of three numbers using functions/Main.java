import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      int b=sc.nextInt();
      int min;
      if(n<m && n<b)
      {
        min=n;
      }
      else if(m<n && m<b)
      {
        min=m;
      }
      else
      {
        min=b;
      }
      System.out.print(min);
      /*for(int i=min;i>=1;i--)
      {
        if(n%i==0 && m%i==0 && b%i==0)
        {
          System.out.println(i);
        }
      }*/
	}
}