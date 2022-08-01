import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4344 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int c = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
	
		int n=0;
		int[] score;
		int sum = 0;
		float avg = 0;
		for(int i=0;i<c;i++)
		{
			sum = 0;
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			
			score= new int[n];
			for(int j=0;j<n;j++)
			{
				score[j] = Integer.parseInt(st.nextToken());
				sum+=score[j];
			}
			avg = sum/n;
			
			showAvgUpStudentPercentage(avg,score,n);
		}
		
	}
	
	public static void showAvgUpStudentPercentage(float avg,int[] score,int num)
	{
		int count=0;
		for(int i=0;i<score.length;i++)
		{
			if(avg<score[i])
			{
				count++;
			}
		}
		float percent = (float)count*100/num;
		
		System.out.printf("%.3f%%",percent);
		System.out.println();
	}

}
