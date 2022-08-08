import java.util.Scanner;

public class B1712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		int b = scan.nextInt();
		int c = scan.nextInt();
		int gap = c-b;
		if(b>=c)
		{
			System.out.println(-1);
			return;
		}
		
		else
		{
			System.out.println(a/gap +1);
		}
	}

}
