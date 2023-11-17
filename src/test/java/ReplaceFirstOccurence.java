
public class ReplaceFirstOccurence {

	public static void main(String[] args) {
		
		String str = "tommorrow";
		
		String firstString = str.substring(0, 3);
		String secondString = str.substring(3);
		
	   secondString = secondString.replaceFirst(Character.toString('o'), "\\$");
	   
	   String ansString = firstString+secondString;
	   System.out.println(ansString);
		
	}

}
