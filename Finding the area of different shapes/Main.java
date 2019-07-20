import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      //int a[]=new int[100];
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      
      switch(n)
      {
        case 1:
          int a=sc.nextInt();
          System.out.println(a*a);
          break;
        case 2:
          int x=sc.nextInt();
          int b=sc.nextInt();
          System.out.println(x*b);
          break;
        case 3:
          int c=sc.nextInt();
          int d=sc.nextInt();
          int h=(c*d)/2;
          System.out.println(h);
          break;
        case 4:
          int z=sc.nextInt();
          double y;
          y=3.14*z*z;
          System.out.println(y);
          break;
         default :
           System.out.println("Invalid choice");
      }   
          
    }
}