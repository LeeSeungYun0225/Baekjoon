import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int m = scan.nextInt();
		int n = scan.nextInt();
		
		List<String> list = new ArrayList();
		
		for(int i=0;i<m;i++)
		{
			list.add(scan.next());
		}
		
		
		
		int bestcase = 90000;
		int sum1=0;
		int sum2=0;
		boolean tab = true;
		
		for(int i=0;i<=m-8;i++)
		{
			
			for(int k=0;k<=n-8;k++)
			{
				for(int j=i;j<8+i;j++)
				{
					for(int l=k;l<8+k;l++)
					{
						if(list.get(j).charAt(l) == 'W')
						{
							if(tab)
							{
								sum2++;
								tab = false;
							}
							else
							{
								sum1++;
								tab = true;
							}
						}
						else if(list.get(j).charAt(l) == 'B')
						{
							if(tab)
							{
								tab = false;
								sum1++;
							}
							else
							{
								tab = true;
								sum2++;
							}
						}
					}
					if(tab)
					{
						tab = false;
					}
					else
					{
						tab = true;
					}
				}
				if(sum2<bestcase)
				{
					bestcase = sum2;
				}
				if(sum1 < bestcase)
				{
					bestcase = sum1;
				}
				
				sum1 = sum2 = 0;
				
			}
		}
		
	
		
		
		
	
		
		System.out.println(bestcase);
		
	}

}
