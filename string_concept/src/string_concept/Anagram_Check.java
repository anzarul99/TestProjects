package string_concept;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram_Check {

	public static void main(String[] args) 
	{
		// The strings should have same characters but in different orders.
		
		anagramcheck(" good", "doog");
		

	}
	public static void anagramcheck(String st1, String st2)
	{
	st1.replaceAll(" ", "");
	st2.replaceAll(" ", "");
	boolean status = true;
	
	if(st1.length()!=st2.length())
	{
		System.out.println("Both are not same length string");
		status= false;
	}
	else
	{
		char [] ch1= st1.toLowerCase().toCharArray();
		char [] ch2= st2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		status = Arrays.equals(ch1, ch2);
	}
		if(status)
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
	}

}
