import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class B2562 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int n = 9;
		int[] arr = new int[n];	
		int max = 0;
		int index = -1;
		
		for(int i=0;i<n;i++)
		{
			try {
				arr[i] = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(max<arr[i])
			{
				max=arr[i];
				index= i;
			}

		}
		
		
		System.out.println(max);
		System.out.println(index+1);
	}
}
