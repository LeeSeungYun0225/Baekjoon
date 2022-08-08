import java.util.Scanner;

public class B2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int t=1;
		int k=0;
		int count =1;
		while(t+k*6<n)
		{
			
			t++;
			k+=t;
			count++;
		}
		System.out.println(count);
		

		
	}

}
