import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
        int sum=0;
      int n= sc.nextInt();
      int r;
      r=n%10;
      while(n>9)
      {
        n/=10;
      }
	
      sum=sum+n+r;
      System.out.println(sum);
    }
}