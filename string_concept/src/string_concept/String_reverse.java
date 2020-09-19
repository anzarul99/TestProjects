package string_concept;

public class String_reverse 
 {
	
	public static void main(String[] args) 
	 {
		
		  String s= "My India"; 
		  String [] str= s.split(" "); 
		  for(String words:str) 
		  {
		  String revSt=reversestring(words);
		  
		  System.out.print(revSt+ " "); 
		  }
		 
		
	
	 }
		public static String reversestring(String word )
		{
		    
		    
			String rev="";
		     char[]ch=word.toCharArray();
		     for (int i = ch.length-1;i>=0;i--)
		     {
		    	 rev+=ch[i];
		    	 
		     }
		return rev;
	    }
	}
		
