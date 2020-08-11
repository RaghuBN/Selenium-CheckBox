package CheckBoxDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SpecejetCheckBox {
	@Test
	public void TestRadioBtn() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium Browsers Jars\\Chrome\\Chrome 84\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());  
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();  
        Thread.sleep(5000);
       
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());  
  
        driver.close();  
	}
}
