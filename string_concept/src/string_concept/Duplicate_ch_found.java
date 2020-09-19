package string_concept;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Duplicate_ch_found 
{
	public static void main(String[] args) 
	{
      
		countduplicatechars("Anzarul Haque");
		
		

	}
	
	public static void countduplicatechars(String word)
	{
		String nwword= word.toUpperCase();
		char [] ch = nwword.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(Character chr: ch)
		{
			if(!hm.containsKey(chr))
			{
				hm.put(chr, 1);
			}
			else
			{
				
				hm.put(chr, hm.get(chr)+1);
			}
		}
		
		
		for(Map.Entry<Character, Integer> en: hm.entrySet())
		{
			System.out.println(en.getKey() + " " + en.getValue());
		}
		
	}
	
	

}
