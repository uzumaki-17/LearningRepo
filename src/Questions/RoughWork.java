package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class RoughWork {

	public static void main(String[] args) {
		int [] arr = {1,0,4,0,2,0,0,9,0};
//		{0,0,0,0,0,1,4,2,9}
		
		
		
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				al.add(arr[i]);
			}
		}
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]!=0)
			{
				al.add(arr[j]);
			}
		}
		System.out.println(al);
		
		
	}
}
