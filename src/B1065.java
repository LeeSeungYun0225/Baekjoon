import java.util.Scanner;

public class B1065 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int count =0;
	
		
		if(n<=99)
		{
			System.out.println(n);
		}
		else
		{
			count=99;
			for(int i=100;i<=n;i++)
			{
				if(hanNum(i))
				{
					count++;
				}
			}
			
			System.out.println(count);
		}
		
		
		
	}
	
	public static boolean hanNum(int in)
	{
		int temp = in;
		boolean result = true;
		int val=temp%10-(temp/10)%10;
		int val2;
		while(temp/10!=0)
		{
			val2 = temp%10-(temp/10)%10;
			if(val !=  val2)
			{
				
				result = false;
				break;
			}
			
			temp/=10;
		}
		return result;
	}
}
