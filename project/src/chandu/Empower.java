package chandu;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Empower 
{
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
	Actions a=new Actions(driver);
	WebElement e=driver.findElement(By.cssSelector("#mega-menu-9 > li:nth-child(5) > a"));
	a.moveToElement(e).build().perform();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"mega-menu-9\"]/li[5]/ul/li/div/div/div/div[1]/ul/li[2]/a")).click();
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("")).click();

	}  
}
