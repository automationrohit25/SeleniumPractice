package interviewJavaPrograms;

import java.util.HashSet;

public class FirstRepeatedExample {
	
	public static void repeatedFirst(String str) {
		
		HashSet<Character> hs = new HashSet<>();
		char ch[] = str.toCharArray();
		
		for(int i = 0; i < ch.length; i++) {
			if(hs.add(ch[i]) == false) {
				System.out.println("First repeated character " + ch[i]);
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		repeatedFirst("acdvc");
	}

}
