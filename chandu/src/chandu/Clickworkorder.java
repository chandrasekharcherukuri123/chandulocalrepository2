package chandu;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickworkorder {

	public static void main(String[] args) throws InterruptedException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username");
		String u=sc.nextLine();
		System.out.println("enter password");
		String p=sc.nextLine();
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://52.7.33.41:8180/fleetcycle/initLogin.do?service_lookup=initLogin");
		Thread.sleep(5000);
		driver.findElement(By.name("FLEETCYCLE_USERNAME")).sendKeys(u);
		driver.findElement(By.name("FLEETCYCLE_PASSWORD")).sendKeys(p,Keys.ENTER);
		Thread.sleep(10000);
		//driver.findElement(By.cssSelector("#\\38 a80808b5d7e0bd0015d7e771b0c12c5 > div > div:nth-child(2) > a")).click();
		Thread.sleep(5000);
		//Actions a=new Actions(driver);
		//WebElement e=driver.findElement(By.cssSelector("#mega-menu-9 > li:nth-child(3) > a"));
		//a.moveToElement(e).build().perform();
		//driver.findElement(By.cssSelector("#mega-menu-9 > li:nth-child(3) > ul > li > div > div > div > div:nth-child(5) > ul > li:nth-child(4) > a")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.cssSelector("#configurationGroupIdControlId")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.cssSelector("#configurationGroupIdControlId")).click();
		//driver.findElement(By.cssSelector("#mega-menu-9 > li:nth-child(3) > ul > li > div > div > div > div:nth-child(2) > ul > li:nth-child(6) > a")).click();
		Actions a=new Actions(driver);
		WebElement e=driver.findElement(By.cssSelector("#mega-menu-9 > li:nth-child(5) > a"));
		a.moveToElement(e).build().perform();
		driver.findElement(By.cssSelector("#mega-menu-9 > li:nth-child(5) > ul > li > div > div > div > div:nth-child(1) > ul > li:nth-child(2) > a")).click();
		//Thread.sleep(5000);
		driver.findElement(By.cssSelector("#mega-menu-9 > li:nth-child(5) > ul > li > div > div > div > div:nth-child(1) > ul > li:nth-child(2) > a")).click();
	    // driver.findElement(By.cssSelector("#mega-menu-9 > li:nth-child(3) > ul > li > div > div > div > div:nth-child(2) > ul > li:nth-child(5) > a")).click();
	    // Thread.sleep(5000);
	  // driver.findElement(By.cssSelector("#\\38 a80808b5d7e0bd0015d7e771b0c12c5 > div > div:nth-child(2) > a")).click();
	  // Thread.sleep(3000);
	 //findElement(By.cssSelector("#\\38 a80808b5d8a45b6015d9799b3872294_body > div > table > tbody > tr:nth-child(1) > td:nth-child(2) > a")).click();
	//predock driver.findElement(By.cssSelector("#\\38 a80808b5d8a45b6015d97d3626e2322_body > div > table > tbody > tr:nth-child(1) > td:nth-child(2) > a")).click();
	}
	

}
