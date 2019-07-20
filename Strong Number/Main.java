import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=0,r,t;
      t=n;
      while(n>0)
      {
        r=n%10;
        int f=1;
        for(int i=1;i<=r;i++)
        {
          f=f*i;
        }
        sum+=f;
        n/=10;
      }
      if(sum==t)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }

	}
}