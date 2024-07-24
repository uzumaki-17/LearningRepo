package Questions;

import java.util.*;

public class stringAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = "god";
		String s2 = "dog";
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		int counter =0;
		
		if(s1.length()==s2.length())
		{
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for(int i=0;i<s1.length();i++)
			{
				if(ch1[i]==ch2[i])
				{
					counter++;
				}
			}
		}
//		else
//		{
//			System.out.println(false);
//			
//		}
		
		if(counter==s1.length())
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}

	}

}
