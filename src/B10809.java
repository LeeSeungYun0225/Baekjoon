import java.util.Scanner;

public class B10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		int[] arr = new int[26];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = -1;
		}
		int idx = 0;
		for(int i=0;i<str.length();i++)
		{
			idx = str.charAt(i)-'a';
			if(arr[idx]==-1)
			{
				arr[idx] = i;
			}
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}

}
