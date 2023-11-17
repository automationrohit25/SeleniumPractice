
public class Stringexam {

	public static void main(String[] args) {
		
//		Separate Upper ad Lower case letters from String s = "JaVaPyThon"
//				 s1 = "JVPT";s2 = "aayhon"
		
		
		String str = "JaVaPyThon";
		String s1 = "";
		String s2 = "";
		
		for(int i =0; i < str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				s1 = s1 + str.charAt(i);
			}else if(Character.isLowerCase(str.charAt(i))){
				s2 = s2 + str.charAt(i);
			}
		}
		
		System.out.println("S1 => " +s1);
		System.out.println("S2 => " +s2);
	}

}
