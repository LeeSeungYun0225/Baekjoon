import java.util.Scanner;

public class B1316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int count = 0;
		String str;
		for(int i=0;i<n;i++)
		{
			str = scan.next();
			if(isGroupStr(str))
			{
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	public static boolean isGroupStr(String in)
	{
		boolean result = true;
		
		int[] arr = new int[26];
		int idx=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = -1;
		}
		
		for(int i=0;i<in.length();i++)
		{
			idx = in.charAt(i)-'a';
			if(arr[idx] == -1 || arr[idx] == i-1)
			{
				arr[idx] = i;
			}
			else
			{
				arr[idx] = 999;
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] ==999)
			{
				return false;
			}
			
		}
		
		
		return result;
	}

}
