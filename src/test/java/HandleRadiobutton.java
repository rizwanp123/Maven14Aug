import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import driver.BaseClass;

public class HandleRadiobutton extends BaseClass {
	
	public static void main(String[] args) {
		
		driver.get("https://sqengineer.com/practice-sites/basic-web-elements/");
		
		driver.findElement(By.id("femaleGender")).click();
		
		driver.close();
	}

}
