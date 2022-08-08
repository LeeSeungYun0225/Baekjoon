import java.util.Scanner;

public class B10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		System.out.println(factorial(n));
		
	}
	
	public static int factorial(int in)
	{
		int result=in;
		
		return in>1?result*(factorial(in-1)):1;
	}

}
