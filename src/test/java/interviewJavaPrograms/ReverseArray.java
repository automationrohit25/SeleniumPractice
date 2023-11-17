package interviewJavaPrograms;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
	
		int arr[] = {1,2,3,4,5,6};
		
		int temp;
		int n = arr.length;
		
		int start = 0;
		int end = n -1;
		
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		
//		for(int j = 0; j < n; j++) {
//			System.out.print(arr[j] + " ");
//			
//		}
		
		System.out.println(Arrays.toString(arr));
		

	}

}
