package com.cdac.acts;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class TestClass {
	WebDriver driver;
	@BeforeTest
    public void profileSetup()
    {	
		 driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        
    }
	@Test
  public void testCurrentUrl() throws InterruptedException
  {
  driver.get("https://artoftesting.com/samplesiteforselenium");
     
  }
	@Test
    public void linkTest() throws InterruptedException
    {
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		   
    }
	@Test
    public void textBoxTest() throws InterruptedException
    {
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.findElement(By.id("fname")).sendKeys("Hello Testing!!!!!");
		driver.findElement(By.id("idOfButton")).click();
		   
    }
	@Test
    public void dbClick() throws InterruptedException
    {
		driver.get("https://artoftesting.com/samplesiteforselenium");

        WebElement button = driver.findElement(By.id("dblClkBtn")); 

        Actions actions = new Actions(driver);

        actions.doubleClick(button).perform();

		   
    }
	@Test
    public void radioTest() throws InterruptedException
    {
		driver.get("https://artoftesting.com/samplesiteforselenium");

		driver.findElement(By.id("male")).click();
		//driver.findElement(By.id("female")).click();
		   
    }
	@Test
    public void checkBoxTest() throws InterruptedException
    {
		driver.get("https://artoftesting.com/samplesiteforselenium");

		driver.findElement(By.className("Automation")).click();
		driver.findElement(By.className("Performance")).click();
		   
    }
	@Test
    public void selectBoxTest() throws InterruptedException
    {
		driver.get("https://artoftesting.com/samplesiteforselenium");

		driver.findElement(By.id("performance")).click();
		driver.findElement(By.xpath("//div[@id='container']/button")).click();

    }
	@Test
    public void alertBoxTest() throws InterruptedException
    {
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.findElement(By.xpath("//div[@id='AlertBox']/button")).click();

    }
	@Test
    public void confirmBoxTest() throws InterruptedException
    {
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.findElement(By.xpath("//div[@id='ConfirmBox']/button")).click();

    }
	@Test
    public void dragImageTest() throws InterruptedException
    {
		driver.get("https://artoftesting.com/samplesiteforselenium"); 
        WebElement image = driver.findElement(By.id("myImage"));  
        WebElement textBox = driver.findElement(By.id("targetDiv"));  

        // Step 3: Use Actions class to perform drag and drop
        Actions actions = new Actions(driver);
        actions.dragAndDrop(image, textBox).perform();

    }
	@AfterTest
    public void reportReady()
    {
        System.out.println("Report is ready to be shared, with screenshots of tests");
    }
}
