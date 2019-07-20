import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int i,j;
    int a[][]=new int[n][m];
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
        System.out.print(a[j][i]+" ");
      }
      System.out.println();
    }
    
    
  }
}