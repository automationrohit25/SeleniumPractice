import java.util.Arrays;

public class Test1 {
	
	static int[] shiftZeroToRight(int[] a) {
		
		if(a.length == 1)
			return a;
		
		int[] newArray = new int[a.length];
		
		int count = 0;
		for(int number:a) {
			if(number!=0) {
				newArray[count] = number;
				count++;
			}
		}
		
		return newArray;
		
		
	}

	public static void main(String[] args) {
		
		int[] arr = {0,0,0,0,5,9,0,0,1,4,0,8,3};
		System.out.println(Arrays.toString(shiftZeroToRight(arr)));

	}

}
