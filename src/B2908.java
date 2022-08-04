import java.util.Scanner;

public class B2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		a= reverseInteger(a);
		b = reverseInteger(b);
		System.out.println(a>b?a:b);
		
	}
	
	public static int reverseInteger(int in)
	{
		
		int result = 0;
		while(in!=0)
		{
			result= result*10+ in%10;
			in/=10;
		}
		
		
		return result;
	}

}
