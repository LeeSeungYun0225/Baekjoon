import java.util.Scanner;

public class B10818 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];	
		int max = 0;
		int min = 1000000;
		
		for(int i=0;i<n;i++)
		{
			arr[i] = scan.nextInt();
			if(max<arr[i])
			{
				max=arr[i];
			}
			else if(min>arr[i])
			{
				min = arr[i];
			}
		}
		
		
		System.out.print(min + " " + max);
	}
}
