package interviewJavaPrograms;

import java.util.HashSet;
import java.util.Iterator;

public class Test7 {

	public static void main(String[] args) {
		
		int arr[] = {1, 4321, 02, 23, 23, 999, 4323, 123123, 999, 4321}; //output = [1,1234,2, 32,999,3234, 321321]
		
		System.out.println(Math.abs(02));
		int revnum = 0;
		
		HashSet<Integer> hs = new HashSet<>();
		HashSet<Integer> hs1 = new HashSet<>();
		for(int i = 0; i < arr.length; i++) {
			if(hs.add(arr[i]) == true) {
				hs.add(arr[i]);
			}
		}
		
		System.out.println(hs);
		
		
	   Iterator<Integer> it =  hs.iterator();
	   while(it.hasNext()) {
		   int num = it.next();
		   if(num/10 != 0) {
			   int digit = num % 10;
			   revnum = revnum * 10 + digit;
			   num = num /10;	   
		   }
		   
		   System.out.println(revnum);
	   }
	 
		
	}

}
