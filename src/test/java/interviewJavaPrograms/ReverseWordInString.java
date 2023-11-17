package interviewJavaPrograms;

public class ReverseWordInString {

	public static void main(String[] args) {
		
		reverseWords("Hello World");
	}
	
	static void reverseWords(String str) {
		
		String rev ="";	
		String[] words = str.split(" ");
		for(int i = words.length-1; i >=0; i--) {
			rev = rev + words[i] + " ";
		}
		System.out.println(rev);
	}

}
