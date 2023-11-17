package interviewJavaPrograms;

import java.util.HashMap;

public class FirstNonRepeatedExample {
	
	public static void firstRepeatedCharacter(String str) {
		HashMap<Character,Integer> hashmap = new HashMap<>();
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(hashmap.containsKey(c)) {
				hashmap.put(c, hashmap.get(c)+1);
			} else {
				hashmap.put(c, 1);
			}
		}
		
		for(int i = 0; i < str.length();i++) {
			char c = str.charAt(i);
			if(hashmap.get(c) == 1) {
				System.out.println("first non repeating character " + c);
				break;
			}
		}
	}

	public static void main(String[] args) {
	
		firstRepeatedCharacter("GeeksForGeeks");
	}

}
