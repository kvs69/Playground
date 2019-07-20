import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i,s,j;
      int count,temp=1;
      count=n-1;
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=count;j++)
        {
          System.out.print(" ");
        }
        for(s=1;s<=temp;s++)
        
          {
          System.out.print("*");
          }
          count--;
        temp+=2;
          
        System.out.print("\n");
      }
	}
}