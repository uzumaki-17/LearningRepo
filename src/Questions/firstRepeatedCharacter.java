package Questions;

import java.util.HashMap;
import java.util.Map;

public class firstRepeatedCharacter {

	public static void main(String[] args) {
		String s = "ujjwal";
		char[] ch = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(char c:ch)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		for(Map.Entry<Character, Integer> entry:hm.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println("this is the first repeated character "+entry.getKey());
				break;
			}
		}

	}

}
