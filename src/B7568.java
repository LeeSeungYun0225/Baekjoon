import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B7568 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		List<Person> list = new ArrayList();
		
		for(int i=0;i<n;i++)
		{
			list.add(new Person(scan.nextInt(),scan.nextInt()));
		}
		
		StringBuilder sb = new StringBuilder();
		
		
		for(Person p :list)
		{
			int sum = 0;
			for(int i=0;i<list.size();i++) {
				if(getResult(list.get(i),p) == 1)
				{
					sum++;
				}
			}
			
			sb.append(sum+1).append(" ");
			
		}
		
		System.out.println(sb);

	}
	
	public static int getResult(Person a,Person b)
	{
		if(a.weight>b.weight && a.height>b.height)
		{
			return 1;
		}
		else if(a.weight<b.weight && a.height<b.height)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	
	static class Person {
		
		int weight;
		int height;
		
		
		public Person(int weight,int height)
		{
			this.weight = weight; 
			this.height = height;
		}



		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "weight : " + weight + " // height : " + height;
		}
		
	}
}
