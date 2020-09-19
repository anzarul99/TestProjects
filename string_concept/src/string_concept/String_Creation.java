package string_concept;

public class String_Creation {

	public static void main(String[] args) {
		
		
		String s1= "This is the first  string";
		String s2 = new String("good");
		String s4= s2.intern();
		String s5 = "good";
		String s6= s5.intern();
		System.out.println(s4);
		System.out.println(s6);
		System.out.println(s6==s2);
		
		System.out.println(s1);
		
		String s3= s1.concat(" devil");
		System.out.println(s3);
		
		System.out.println(s1.substring(4));
		
		System.out.println(s1.length());
		
		System.out.println(s1.toString());
		System.out.println(s1.split(" "));
		
		
 
	}

}
