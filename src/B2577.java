import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2577 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = {0,0,0,0,0,0,0,0,0,0};
		
		int result = 1;
		
		for(int i=0;i<3;i++)
		{
			try {
				result*=Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		while(result!=0)
		{
			arr[result%10]++;
			result/=10;
		}
		
		for(int i=0;i<10;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}
