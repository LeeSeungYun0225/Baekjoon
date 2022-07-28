import java.util.Scanner;

public class B2588 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int a= scan.nextInt();
		int b= scan.nextInt();
		
		int result = a*b;
		while(b!=0)
		{
			System.out.println(a*(b%10));
			b/=10;
		}
		
		System.out.println(result);
	}
}
