import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int i,j;
    int a[][]=new int[n][m];
    int b[][]=new int[n][m];
    int sum[][]=new int[n][m];
    for(i=0;i<n;i++)
    {
      for(j=0;j<m;j++)
      {
        a[i][j]=sc.nextInt();
      }
    }
    for(i=0;i<n;i++)
    {
      for(j=0;j<m;j++)
      {
        b[i][j]=sc.nextInt();
      }
    }
    for(i=0;i<n;i++)
    {
      for(j=0;j<m;j++)
      {
        sum[i][j]=a[i][j]-b[i][j];
        System.out.print(sum[i][j]+" ");
      }
      System.out.println();
    }
    
    
  }
}