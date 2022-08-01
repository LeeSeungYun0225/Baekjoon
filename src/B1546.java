import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1546 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int n = Integer.parseInt(br.readLine());
		int[] score = new int[n];
		float sum = 0;
		int max = 0;

		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
		{
			score[i] = Integer.parseInt(st.nextToken());
			sum+=score[i];
			if(max<score[i])
			{
				max = score[i];
			}
		}
		
		System.out.print(sum*100/max/n);
	}
}
