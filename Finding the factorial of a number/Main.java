import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=1;
    while(n>0)
    {
      sum=sum*n;
      n--;
    }
    System.out.print(sum);
  }
}