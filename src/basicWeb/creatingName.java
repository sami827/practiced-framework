package basicWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class creatingName {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://letskodeit.teachable.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseURL);
		
		driver.findElement(By.name("enter-name")).sendKeys("I love you");
		
		

	}

}
