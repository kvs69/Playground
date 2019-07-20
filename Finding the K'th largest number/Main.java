import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int i,j;
      //int m=sc.nextInt();
      //int b[]=new int[];
      int temp;
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      int m=sc.nextInt();
      for(i=0;i<n;i++)
      {
        for(j=i+1;j<n;j++)
        {
          if(a[i]<a[j])
          {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
          }
        }
      
      }
      System.out.print(a[m-1]);
    }   
}
