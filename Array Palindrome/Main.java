import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int i,j,k,flag=0;
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      for(i=0;i<n;i++)
      {
        if(a[i]!=a[n-i-1])
        {
          flag=1;
          break;
        }
      }
      if(flag==1)
      {
        System.out.print("No");
      }
      else
      {
        System.out.print("Yes");
      }
          
    }
}