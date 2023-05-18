package Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sam.constant.FrameworkConstant;
import org.testng.annotations.Test;

public class Practice {
	static WebDriver driver;

	public static void elementToBeVisible(WebElement element) {

		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(element));

	}

	@Test
	public void test() {

		System.setProperty("webdriver.chrome.driver", FrameworkConstant.CHROMEDRIVERPATH());

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com");

		driver.findElement(By.xpath("//button[text()='Dropdown']")).click();

		WebElement findElement = driver.findElement(By.xpath("//a[text()='Flipkart']"));

		Practice.elementToBeVisible(findElement); // visibility of for send keys and element to be clickable for click
													// action
		findElement.click();

	}

}
