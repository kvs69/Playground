import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=0,i;
 	  for(i=n;i>=1;i--)
      {
        sum=sum+i;
      }
      System.out.print(sum);
	}
}