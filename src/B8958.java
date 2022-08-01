import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B8958 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String str;
		int result = 0;
		for(int i=0;i<n;i++)
		{
			str = br.readLine();
			
			result+=getScore(str);
		}
		
	}
	
	public static int getScore(String str)
	{
		int result = 0;
		
		StringTokenizer st = new StringTokenizer(str,"X");
		String temp;
		while(st.hasMoreTokens())
		{
			temp = st.nextToken();
			result+=getCount(temp);
		}
			
		System.out.println(result);
		
	
		return result;	
	}
	
	public static int getCount(String str)
	{
		int result = 0;
		
		for(int i=0;i<str.length();i++)
		{
			result+=i+1;
		}
		
		return result;
	}
}
