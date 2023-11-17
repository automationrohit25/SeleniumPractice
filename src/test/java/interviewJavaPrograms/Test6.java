package interviewJavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test6 {

	public static void main(String[] args) {
		
		String s = "value labs";
		char[] ch = s.toCharArray();
		int count = 0;
		
		List<Object> al = new ArrayList<>();
		
		
		for(int i = 0; i < ch.length; i++) {
			if(s.charAt(i) == 'a') {
				al.add(++count);
			} else {
				al.add(s.charAt(i));
			}
		}
		
		System.out.println(al);
		
		String str = "";
		for (Object fruit : al) {
			str+= fruit+"";
		}
		System.out.println(str);

	}

}
