import java.util.Scanner;

public class B2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		
		
		StringBuilder result;
		for(int i=0;i<n;i++)
		{
			result = new StringBuilder("");
			int m = scan.nextInt();
			String str = scan.next();
			for(int k=0;k<str.length();k++)
			{
				for(int j=0;j<m;j++)
				{
					
						result.append(str.charAt(k));
					
				}
			}
			
			System.out.println(result);
			
			
		}
	}

}
