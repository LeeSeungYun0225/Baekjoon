import java.util.Scanner;

public class B11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		int sum = 0;
		String str = scan.next();
		char temp;
		for(int i=0;i<arr.length;i++)
		{
			temp = str.charAt(i);
			sum+=temp-'0';
		}
		
		System.out.println(sum);
	}

}
