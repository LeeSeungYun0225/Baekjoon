import java.util.Scanner;

public class B10757 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder a = new StringBuilder(scan.next());
		StringBuilder b = new StringBuilder(scan.next());
		a = a.reverse();
		b = b.reverse();
		

		StringBuilder result = new StringBuilder("");
		int max_length=0;
		int min_length=0;

		int check;
		if(a.length()>b.length())
		{
			max_length = a.length();
			min_length = b.length();
			check = 0;
		}
		else if(a.length()==b.length())
		{
			max_length = a.length();
			min_length = b.length();
			check = 1;
		}
		else
		{
			max_length = b.length();
			min_length = a.length();
			check = 2;
		}
		int i=0;
		int temp = 0;
		boolean carry = false;
		while(i<min_length)
		{
			temp= a.charAt(i)-'0' + b.charAt(i)-'0';
			
			if(carry)
			{
				temp = temp+1;

				result.append(temp%10);
				
				
				carry = false;
			}
			else
			{
				result.append(temp%10);
			}
			if(temp/10!=0)
			{
				carry = true;
			}


			
			i++;
			
		}
		

		
		if(check==0)//a남음 
		{
			
			while(i<max_length)
			{
				
				if(carry)
				{
					temp = a.charAt(i)-'0' + 1;
					result.append(temp%10);
					carry=false;
					i++;
					if(temp/10!=0)
					{
						carry = true;
					}
				}
				else
				{
					temp = a.charAt(i)-'0';
					result.append(temp);

					i++;
				}
				
			}
		}
		else if(check==2) // b남음 
		{
			
			while(i<max_length)
			{
				if(carry)
				{
					temp = b.charAt(i)-'0'+1;
					result.append(temp%10);
					carry=false;
					i++;
					if(temp/10!=0)
					{
						carry = true;
					}
				}
				else
				{
					temp = b.charAt(i)-'0';
					result.append(temp);
					i++;
				}
				
			}
		}
		else// 길이 같음 
		{
			if(carry)
			{
				result.append(1);
				carry = false;
			}
		}
		
		
		if(carry)
		{
			result.append(1);
		}
		
		System.out.println(result.reverse());
		
	}
}
