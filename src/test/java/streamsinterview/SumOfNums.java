package streamsinterview;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNums {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,4,5,7,2);
//		Optional<Integer> sum = list.stream().reduce((a,b) -> a+b);
//		System.out.println(sum.get());
		
		
//	###############################################################################
		
		double avg = list.stream().mapToInt(e -> e).average().getAsDouble();
		System.out.println(avg);
	
//	################################################################################
		
		List<Integer> list1 = Arrays.asList(1,10,20,30,15);
		
		
		
		

	}

}
