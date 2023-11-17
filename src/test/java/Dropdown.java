import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {


     Select select = new Select(driver.findElement(""));
     
     List<WebElement> stringValues = select.getOptions();
     
     List<String> list = new ArrayList<>();
      
     for(WebElement ele: stringValues) {
    	 String value = ele.getText();
    	 list.add(value);
     }
     
     System.out.println(Collections.sort(list));
	}

}
