import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i = 0; i < n; i++) 
{ 
int fill = n; 
System.out.print(fill); 
for(int j = 0; j < i; j++) 
{ 
fill--; 
System.out.print(fill); 
} 
for(int k = 0; k < n - i-1; k++) 
System.out.print(fill); 
System.out.println(); 
} 

       //Try your code here
    }
}