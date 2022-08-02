
public class B4673 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] arr = new boolean[10001];
		saveSelfNumber(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(!arr[i])
			{
				System.out.println(i);
			}
		}
		
		
		
	}
	
	public static int getDN(int in)
	{
		int temp = in;
		int result=temp;
		while(temp!=0)
		{
			result+=(temp%10);
			temp/=10;
		}
		
		return result;
	}
	
	public static void saveSelfNumber(boolean[] arr)
	{
		
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = false;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(getDN(i)<arr.length)
			{
				arr[getDN(i)] = true;
			}
			
		}
		
	}

}
