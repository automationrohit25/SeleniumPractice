package testBase;

import java.util.HashMap;
import java.util.Map;

public class IterateHashMap {

	public static void main(String[] args) {
		
		Map<String,String> foodTable = new HashMap<>();
		foodTable.put("A", "angular");
		foodTable.put("J", "java");
		foodTable.put("P", "python");
		
		for(Map.Entry<String, String> set : foodTable.entrySet()) {
			System.out.println(set.getKey() + "----" + set.getValue());
		}
		

	}

}
