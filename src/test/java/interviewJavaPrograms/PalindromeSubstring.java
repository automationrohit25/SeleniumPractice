package interviewJavaPrograms;

public class PalindromeSubstring {
	
	public static boolean isPalindrome(String s) {
		
		int i = 0;
		int j = s.length() - 1;
		
		while(i < j) {
			char ch1 = s.charAt(i);
			char ch2 = s.charAt(j);
			if(ch1!=ch2) {
				return false;
			} else {
				i++;
				j--;
			}
		}
		return true;
		
	}
	
	public static void solution(String str) {
		int len = 1;
		int maxlen = 1;
		for(int i = 0; i < str.length(); i++) {
			for(int j = i+ 1; j < str.length(); j++) {
				String ss = str.substring(i,j);
				if(isPalindrome(ss) == true) {
					len = ss.length();
					maxlen = Math.max(maxlen, len);
//					System.out.println(ss);
				}
			}
		}
		System.out.println(maxlen);
	}

	public static void main(String[] args) {
	
			solution("nitin");
	}

}
