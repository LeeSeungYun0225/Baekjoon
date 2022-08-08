import java.util.Scanner;

public class B10870 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if(n==0)
		{
			System.out.println(0);
		}
		else if(n==1)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(pivonacchi(n));
		}
	}
	public static int pivonacchi(int in)
	{		
		return in>2?pivonacchi(in-2)+pivonacchi(in-1):1;
	}

}
