package com.cdac.acts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class App 
{
    public static void main( String[] args )
    {
       WebDriver driver = new ChromeDriver();
	   driver.get("https://the-internet.herokuapp.com/login");
	   driver.findElement(By.id("username")).sendKeys("tomsmith");
	   driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	   driver.findElement(By.className("radius")).click();
	   driver.quit();
    }
}