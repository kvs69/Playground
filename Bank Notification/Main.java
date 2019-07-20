import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //write your logic here
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      int n=sc.nextInt();
      if(n==1)
      {
        System.out.println("KVB-Notification by SMS");
      }
      if(n==2)
      {
        System.out.println("ICICI-Notification by Mail");
      }
      if(n==3)
      {
        System.out.println("SBI-Notification by Courier");
      }
    }
}