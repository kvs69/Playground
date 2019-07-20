import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int i;
    for(i=0;i<s.length();i++)
    {
      if((s.charAt(i))!='a'&&(s.charAt(i))!='e'&&(s.charAt(i))!='i'&&(s.charAt(i))!='o'&&(s.charAt(i))!='u')
      {
        System.out.print(s.charAt(i));
      }
    }
  }
}