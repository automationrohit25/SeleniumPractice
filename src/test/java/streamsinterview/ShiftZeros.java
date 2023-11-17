package streamsinterview;

public class ShiftZeros {

	public static void main(String[] args) {
		
		 int arr [] = {1,5,7,4,3,0,5,5,6,0,0,4,5,4,5};
//		 int arr1[] = new int[arr.length];
		 int temp;
		 for(int i = 0; i < arr.length; i++) {
			 for(int j = i+1; j < arr.length; j++) {
				 if(arr[i] > arr[j]) {
					 temp = arr[i];
					 arr[i] = arr[j];
					 arr[j] =temp;
				 }
				 
			 }
		 }
		 
		 for(int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i] + " ");
		 }
		 
		 
		 
		 
	}

}
