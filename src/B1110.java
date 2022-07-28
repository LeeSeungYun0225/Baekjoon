import java.util.Scanner;

public class B1110 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int i = scanner.nextInt();
		
		int count = 1;
		int temp=(i%10+i/10)%10+(i%10)*10;
		while(temp!=i)
		{
		
			temp = (temp%10+temp/10)%10+(temp%10)*10;
			
			count++;
		}
		System.out.print(count);
	}
}
