import java.util.Arrays;
import java.util.Scanner;

public class B2587 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[5];
		
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		for(int i=0;i<5;i++)
		{
			arr[i] = scan.nextInt();
			sum+=arr[i];
		}
		
		Arrays.sort(arr);
		
		System.out.println(sum/arr.length);
		System.out.println(arr[arr.length/2]);
	}

}
