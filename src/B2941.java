import java.util.Scanner;

public class B2941 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		System.out.println(countCroatiaAlpabets(str));
		
		
	}
	
	
	public static int countCroatiaAlpabets(String str)
	{
		int result = 0;
		
		int counter = 0;
		
		while(counter<str.length())
		{
		
			if(str.charAt(counter)=='c')
			{
				if(counter+1<str.length())
				{
					if(str.charAt(counter+1)=='=' || str.charAt(counter+1) =='-')
					{
						counter ++;
					}
				}
				
			}
			else if(str.charAt(counter) == 'd')
			{
				if(counter+1<str.length())
				{
					if(str.charAt(counter+1) =='-')
					{
						counter ++;
					}
					else if(counter+2<str.length() && str.charAt(counter+1)=='z' && str.charAt(counter+2)=='=')
					{
						counter+=2;
					}
				}
			}
			else if(str.charAt(counter) == 'l')
			{
				if(counter+1<str.length())
				{
					if(str.charAt(counter+1)=='j')
					{
						counter ++;
					}
				}
			}
			else if(str.charAt(counter) == 'n')
			{
				if(counter+1<str.length())
				{
					if(str.charAt(counter+1)=='j')
					{
						counter ++;
					}
				}
			}
			else if(str.charAt(counter)=='s')
			{
				if(counter+1<str.length())
				{
					if(str.charAt(counter+1)=='=')
					{
						counter ++;
					}
				}
			}
			else if(str.charAt(counter) =='z')
			{
				if(counter+1<str.length())
				{
					if(str.charAt(counter+1)=='=')
					{
						counter ++;
					}
				}
			}
			result ++;
			counter++;
		}
		
		
		return result;
	}

}
