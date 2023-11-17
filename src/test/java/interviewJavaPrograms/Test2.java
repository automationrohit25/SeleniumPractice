package interviewJavaPrograms;

import java.util.Arrays;

public class Test2 {
	
		public static void main(String[] args) {
			
			  int arr[] = new int[10]; 
			  int i = 5; arr[i++] = ++i+i++;
			  System.out.println(arr[5]+":"+arr[6]);
			 
		//*********************************************	
			int j = 4;
			int ja[][][] = new int[j][j=3][j];
			System.out.println(ja.length + "," + ja[0].length+ "," + ja[0][0].length);
			
		}
}
