import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B25305 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int k = scan.nextInt();
		
		Integer[] arr = new Integer[n];
		
		
		for(int i=0;i<n;i++)
		{
			arr[i] = scan.nextInt();
		}
		
		
		
		//Arrays.sort(arr,Collections.reverseOrder());
		
		Arrays.parallelSort(arr, (x,y)->{
			return x>y ? -1 : x==y ? 0 : 1;
		});
		
		System.out.println(arr[k-1]);
		
		
	}

}
