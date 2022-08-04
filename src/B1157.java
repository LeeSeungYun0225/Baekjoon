import java.util.Scanner;

public class B1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		str = str.toLowerCase();
		
		int[] arr = new int[26];
		
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] =0;
		}
		
		for(int i=0;i<str.length();i++)
		{
			arr[(int)(str.charAt(i)-'a')]++;
		}
		
		int max = 0;
		int temp=-1;
		int count = 0;
		for(int i=0;i<arr.length;i++)
		{	
			if(max<arr[i])
			{
				count=1;
				max = arr[i];
				temp = i;
			}
			else if(max == arr[i])
			{
				count++;
			}
		}
		
		if(count>1)
		{
			System.out.println("?");
		}
		else
		{
			char a = (char) (temp+'A');
			System.out.println(a);
		}
	}

}
