import java.util.Scanner;

public class B11729 {

	static int count=0;
	static StringBuilder str = new StringBuilder("");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		hanoiTower(n,1,2,3);
		
		System.out.println(count);
		
		System.out.println(str);
	}
	
	
	public static void hanoiTower(int n,int start,int by,int to)
	{
		if(n==1)
		{
			count++;
			str.append(start+" " +to+"\n");
		}
		else
		{
			count++;
			hanoiTower(n-1,start,to,by);
			str.append(start+" " +to+"\n");
			hanoiTower(n-1,by,start,to);
		}
	}
	
	
}
