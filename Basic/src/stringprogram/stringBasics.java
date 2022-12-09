package stringprogram;

public class stringBasics {

	public static void main(String[] args) {
		 String S1=" JoyFull ";

		//String S1 = new String("JoyFule");
		System.out.println(S1);
		System.out.println(S1.charAt(1));
		System.out.println(S1.charAt(2));             //character printing using index number
		System.out.println(S1.indexOf('o'));            //using chaAacter we can find the position of character
		System.out.println(S1.concat("Full"));              //adding to string
		
		System.out.println("boolean method result can be true either false only");
		//boolean method result can be true either false only
		System.out.println(S1.isEmpty()); 			    //checking whether string is empty or not 
		System.out.println(S1.endsWith("y")); 		      //checking string ends with the given character or not
		System.out.println(S1.startsWith("J")); 		   ///checking whether the String start with the given char or not 
		
		System.out.println(S1.equals("Joy")); 				// checking whether string match with the original string or not
		System.out.println(S1.toLowerCase()); 			   //conversion to lower
		System.out.println(S1.toUpperCase());  
		System.out.println(S1.repeat(7)); 
		System.out.println("================================================================");
		String S = "  Hello jo  ";

		System.out.println(S);
		System.out.println(S.trim());			//to remove all space 
		System.out.println(S.stripLeading());  //back side space will be remove
		System.out.println(S.stripTrailing());   //front side space will be remove
		
		String s2 ="Helo";
		System.out.println(S1.equals(s2)); 					// comparing to string .. comparing	 each character
		System.out.println(S1.compareTo(s2));
		System.out.println(S1.substring(1, 3));
		System.out.println(S1.replace("y", "You are good"));
		System.out.println(S1.intern()==s2.intern());
		System.out.println(S1.length());
	}

}
