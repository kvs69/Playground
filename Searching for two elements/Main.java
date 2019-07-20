import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      int m=sc.nextInt();
      int count=0,count1=0;
      int l=sc.nextInt();
      for(int i=0;i<n;i++)
      {
        if(a[i]==m)
        {
          System.out.println(i);
          count++;
        }
        if(a[i]==l)
        {
          System.out.println(i);
          count1++;
        }
      }
      if(count==0 || count1==0)
      {
        System.out.println("-1");
      }
        
      
      
    }
}
