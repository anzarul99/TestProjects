package string_concept;

import java.util.Scanner;

public class Vowel_counts_in_string {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String st= sc.nextLine();
		
		char[] ch= st.toCharArray();
		int count = 0;
		
		for(char c: ch)
		{
			switch(c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				
				break;
				default:
			
			}
		}
          System.out.println(count);
	}

}
