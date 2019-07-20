import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i,sum=0,r;
      int temp=n;
      while(n>0)
      {
        r=n%10;
        sum+=r*r*r;
        n/=10;
      }
      if(sum==temp)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
	}
}