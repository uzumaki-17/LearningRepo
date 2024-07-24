package Questions;

import java.util.HashMap;
import java.util.Map;

public class hashMap_count_of_character {

	public static void main(String[] args){
		String s = "abcabcaabbc";
		HashMap<Character,Integer> hm = new HashMap<>();
		int count = 0;
		char[] ch = s.toCharArray();
		for(char c : ch)
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
		System.out.println(hm);
		
		for(Map.Entry<Character, Integer> ent: hm.entrySet())
		{
			System.out.print(ent.getKey());
			System.out.println(ent.getValue());
		}
		
		
    }

}
