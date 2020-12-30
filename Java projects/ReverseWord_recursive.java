package Lesson;

public class ReverseWord_recursive {
	
	private static String reverse(String sentence) {
		 if (sentence.length() == 0) // condition to stop on length = 0
		 return "";
		 
		 // taking the sentence from letter 1 and adding the first letter
		 return reverse(sentence.substring(1)) + sentence.charAt(0); 
		 
		 // The example of how it works:
		 
		 /*r("hello"):
		  * ...return r("ello")+"h";
		  * 
		  * r("ello"):
		  * ...return r("llo")+"e";
		  * 
		  * r("llo"):
		  * ... return("lo")+"l";
		  * 
		  * r("lo"):
		  * ...return("o")+"l";
		  * 
		  * r("o");
		  * ...(")+"o";
		  * 
		  * r(""):
		  * ...return"";
		  */
		 
		 // Now it turns back and adding the last char:
		 
		 /* "o"
		  * "ol"
		  * "oll"
		  * "olle"
		  * "olleh"
		  */
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println(reverse("Hello")); //calls for "reverse"
		
		
	}

}
