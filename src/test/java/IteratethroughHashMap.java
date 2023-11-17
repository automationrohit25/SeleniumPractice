import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratethroughHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		 HashMap<Integer,Object> firstObject = new HashMap<Integer,Object>();
		 firstObject.put(5,"Rohit"); 
		 firstObject.put(5,"30");
		 firstObject.put(5,"Delhi");
		 
		 for (Entry<Integer,Object> set :firstObject.entrySet()) {
 
            // Printing all elements of a Map
            System.out.println(set.getKey() + " = "
                               + set.getValue());
        }
		 
		 
	}

}
