import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class B18870 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		
		int n = scan.nextInt();

		int[] arr = new int[n];
		int[] arr2;
		
		
		
	
		for(int i=0;i<n;i++)
		{
			arr[i] = scan.nextInt();
		}
		
		arr2 = arr.clone();
		
		Arrays.sort(arr2);
		
		
		Map<Integer,Integer> map = new HashMap();
		
		
		
		
		int c= 0;
		for(int i=0;i<arr2.length;i++)
		{
			if(!map.containsKey(arr2[i]))
			{
				map.put(arr2[i], c++);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<arr.length;i++) {
			sb.append(map.get(arr[i])).append(" ");
		}
		
		System.out.println(sb);
		
		
		
	}

}
