import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int v = 1;
	    for(int i= 1; i <= n; i++)
	    {
            // Handle space for each row
	        for(int space = 1; space <= (n - i); space++){
	            System.out.print(" ");
	        }
            // Handle numbers for each row
	        for(int j = 1; j <= i; j++)
	        {
	            System.out.print(v + " ");
	            v++;
	        }
	        System.out.println();
	    }
	}
}