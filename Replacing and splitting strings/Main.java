import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String s1=sc.nextLine();
      StringBuilder sb=new StringBuilder(" ");
      String [] words=s1.split("\\s");
      for(String w: words)
      {
        System.out.println(w);
      }
      
    }
}