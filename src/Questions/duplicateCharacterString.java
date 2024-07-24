package Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class duplicateCharacterString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		HashMap<Character, Integer> hm = new HashMap<>();
		for(int i=0;i<input.length();i++)
		{
			char c = input.charAt(i);
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		for(Map.Entry<Character, Integer> entry : hm.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println("Repeated character is "+entry.getKey());
			}
		}

		

	}
	
	
	}
