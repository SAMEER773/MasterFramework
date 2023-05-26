package Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	@org.testng.annotations.Test
	public void test1() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/test/resources/Executables/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Frames']")).click();
		String text = driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText();
		System.out.println(text);
		String currentUrl = driver.getCurrentUrl();
		assertEquals(text, "Frames");
		
		driver.findElement(By.xpath("//a[text()='iFrame']")).click();
		String currentUrl1=driver.getCurrentUrl();
		assertNotEquals(currentUrl, currentUrl1);
		
		
		String text2 = driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText();
		System.out.println(text2);
		assertEquals(text2.contains("TinyMCE"), true);
		

}
}
