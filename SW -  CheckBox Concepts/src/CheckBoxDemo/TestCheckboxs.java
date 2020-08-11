package CheckBoxDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCheckboxs {
	@Test
	public void TestRadioBtn() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium Browsers Jars\\Chrome\\Chrome 84\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/LTI%20Selenium%20Samples/CheckBox.html");
		
		//driver.findElement(By.xpath("//input[@name='option1']")).click();
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@name='option1']"));
		checkbox.click();
		
		if (checkbox.isSelected()) {
			System.out.println("CheckBox is Selected");
		}
		else {
			System.out.println("CheckBox is Not Selected");
		}
		/*checkbox.click();
		
		if(!checkbox.isSelected())
		{
			System.out.println("CheckBox is Toggle off..!! ");
		}*/
	}	
}
