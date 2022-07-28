import java.util.Scanner;

public class B2439 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				System.out.print(j>=a-i-1?"*":" ");
			}
			System.out.println();
		}
	}
}
