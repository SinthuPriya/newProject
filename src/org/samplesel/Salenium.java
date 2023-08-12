package org.samplesel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;																																									
import org.openqa.selenium.chrome.ChromeDriver;

public class Salenium {
	
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SaleniumSamp\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.halfords.com/");
		
		//WebElement btnClick = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/div[2]/nav/ul/li[1]/a"));
		//btnClick.click();
		
		//WebElement btnclick = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/div[2]/nav/ul/li[1]/ul/li[1]/a"));
		
		//btnclick.click();
		
		
	}

}
