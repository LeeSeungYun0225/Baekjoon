import java.util.Scanner;

public class B2231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int n= scan.nextInt();
		
		int target = n;
		int result;
		for(int i=0;i<n;i++)
		{
			result = makeSum(i);
			if(result == n && target > i)
			{
				target = i;
			}
		}
		
		if(target==n)
		{
			System.out.println(0);
		}
		else
		{
			System.out.println(target);
		}
		
	}
	
	public static int makeSum(int in)
	{
		int temp = in;
		int result = 0;
		result+=in;
		while(in>0)
		{
			result+=in%10;
			in/=10;
		}

		return result;
	}

}
