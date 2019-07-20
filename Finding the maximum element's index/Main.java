import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int f=0;
    int i;
    int a[]=new int[n];
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    int max=a[0];
    
    for(i=1;i<n;i++)
    {
      if(a[i]>max)
      {
        max=a[i];
        f=i;
        
      }
    }
    System.out.println(f);
  }
}