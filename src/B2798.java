import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B2798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		
		int n= scan.nextInt();
		int m = scan.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]= scan.nextInt();
			
		}
		
		int best = 0;
		int sum = 0;
	
		for(int i=0;i<arr.length-2;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				for(int k=j+1;k<arr.length;k++)
				{
					sum = arr[i]+arr[j]+arr[k];
					if(sum == m )
					{
						System.out.println(m);
						return;
					}
					else if(sum <= m && sum>best)
					{
						best = sum;
					}
				}
			}
		}
		
		System.out.println(best);
	}

}
