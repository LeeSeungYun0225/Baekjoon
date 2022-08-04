import java.util.Scanner;
import java.util.StringTokenizer;

public class B1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String str= scan.nextLine();
		
		StringTokenizer st = new StringTokenizer(str);
		int num = st.countTokens();
		System.out.println(num);
	}

}
