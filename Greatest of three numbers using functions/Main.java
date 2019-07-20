import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int  m=sc.nextInt();
      int b=sc.nextInt();
      if(n>m && n>b)
      {
        System.out.print(n);
      }
      else if(m>n && m>b)
      {
        System.out.print(m);
      }
      else
      {
        System.out.println(b);
      }
	}
}