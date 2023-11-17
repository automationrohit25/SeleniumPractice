package interviewJavaPrograms;

import java.util.Arrays;

public class Test {
	static int arr1[] = {1,2,3,4};
	static int arr2[] = {1,2,3,4};

		public static void main(String[] args) {
			System.out.println(arr1.equals(arr2));
			System.out.println(Arrays.equals(arr1,arr2));
			
		}
}
