import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
      int n1=sc.nextInt();
      int n2,n3;
      n2=n1/100;
      n3=n1%10;
      int sum=n2+n3;
      System.out.println(sum);
	}
}