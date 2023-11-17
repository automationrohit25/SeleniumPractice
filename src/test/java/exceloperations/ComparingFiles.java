package exceloperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ComparingFiles {
	
	public static long filesCompareLineByLine(Path path1, Path path2) throws IOException {
		
		BufferedReader bf1 = Files.newBufferedReader(path1);
		BufferedReader bf2 = Files.newBufferedReader(path2);
		
		long linenumber = 1;
		String line1 = "", line2 = "";
		while((line1 = bf1.readLine())!= null) {
			line2 = bf2.readLine();
			if(line2 == null || !line1.equals(line2)) {
				return linenumber;
			}
			linenumber++;
		}
		if(bf2.readLine() == null) {
			return -1;
		} else {
			return linenumber;
		}
		
	}

	public static void main(String[] args) {
		
		
		
	}
	
}