import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc= new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=n1/100;
    int n3=((n1/10)%10);
    int n4=n1%10;
    int r=(n4*100)+(n3*10)+n2;
    System.out.println(r);
  }
}