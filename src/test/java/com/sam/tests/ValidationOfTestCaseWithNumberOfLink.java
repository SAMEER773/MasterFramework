package com.sam.tests;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.sam.driver.DriverManager;
import org.testng.annotations.Test;

public class ValidationOfTestCaseWithNumberOfLink extends BaseTest {
	
	
	@Test
	public void validationOfTestCaseWithNumberOfLink() {
		
		/*open the filpkart
		 * validate title of home page "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"
		 * validate title is not null
		 * validate title is greater than 15 and less than 500
		 * check for the link in page
		 * number of link in page
		 */
		String st="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		DriverManager.getDriver().get("https://www.flipkart.com/");
		DriverManager.getDriver().findElement(By.xpath("//button[text()='✕']")).click();
		String title = DriverManager.getDriver().getTitle();
		
		//Assert.assertTrue(Objects.nonNull(title));
		//Assert.assertEquals(title, st);
		
		//int length = title.length();
		//Assert.assertTrue(length>15 && length<500);
		
		//List<WebElement> findElements = DriverManager.getDriver().findElements(By.tagName("link"));
		//int size = findElements.size();
		
		//System.out.println("the number of link in home page is "+size);
		
		//Assert.assertTrue(size>10 &&size<50);
		
		Assertions.assertThat(title).isNotNull()
		.containsIgnoringCase(st)
		.hasSizeBetween(15, 500);
		
		
		
		
	}

}
