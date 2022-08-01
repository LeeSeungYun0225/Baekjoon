import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3052 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[42];
		
		for(int i=0;i<42;i++)
		{
			arr[i] = 0;
		}
		
		for(int i=0;i<10;i++)
		{
			try {
				arr[Integer.parseInt(br.readLine())%42]++;
			} catch (NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int count = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				count++;
			}
		}
		
		System.out.println(count);
		
	}
}
