package interviewJavaPrograms;

public class RemoveVowels {
	
	public static void removeVowels(String str) {
		String newString = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) ==  'e' || str.charAt(i) ==  'i' || str.charAt(i) ==  'o'
					 || str.charAt(i) ==  'u') {
				
			} else {
				newString = newString + str.charAt(i);
			}
		}
		System.out.println(newString);
	}

	public static void main(String[] args) {
		
		removeVowels("stuck");
	}

}
