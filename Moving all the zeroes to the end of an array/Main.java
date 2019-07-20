import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int i,j,count=0;
      for(i=0;i<n;i++)
      {
       a[i]=sc.nextInt();
      }
      for(i=0;i<n;i++)
      {
        if(a[i]==0)
        {
          count++;
        }
        else
        {
          System.out.print(a[i]+" ");
        }
    }
      while(count>0)
      {
        System.out.print("0 ");
        count--;
      }
    }
}