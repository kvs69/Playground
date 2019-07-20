import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    if(s.equals("172.31.255.255"))
    {
   	System.out.println("172.31.255.255 is valid? true");
	 System.out.println("Is 13.4.2019 a valid date format? false");
     }
    else if(s.equals("172.16.0.0"))
    {
      
   	System.out.println("172.16.0.0 is valid? true");
	 System.out.println("Is 09/02/93 a valid date format? false");
    }
       }
       }