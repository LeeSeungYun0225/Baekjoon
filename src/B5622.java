import java.util.Scanner;

public class B5622 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		int result = 0;
		str = str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			result+=getTimes(str.charAt(i));
		}
		
		System.out.println(result);
	}
	
	public static int getTimes(char in)
	{
		int result = 0;
		
		switch(in)
		{
		case 'a':
		case 'b':
		case 'c':
			result = 2;
			break;
			
		case 'd':
		case 'e':
		case 'f':
			result = 3;
			break;
		case 'g':
		case 'h':
		case 'i':
			result = 4;
			break;
		case 'j':
		case 'k':
		case 'l':
			result = 5;
			break;
		case 'm':
		case 'n':
		case 'o':
			result = 6;
			break;
		case 'p':
		case 'q':
		case 'r':
		case 's':
			result = 7;
			break;
		case 't':
		case 'u':
		case 'v':
			result = 8;
			break;
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			result = 9;
			break;
			
		}
		
		result+=1;
		
		return result;
	}
}
