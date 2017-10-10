package chandu;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableWorkbook;

public class Class
{
  public static void main(String[] args) throws BiffException, IOException, InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  File f=new File("D:\\Book1");
	  Workbook rwb=Workbook.getWorkbook(f);
	  Sheet rsh=rwb.getSheet(0);
	  WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
	  Sheet wsh=wwb.getSheet(0);
      int nour=rsh.getRows();
      int nouc=rsh.getColumns();
      for(int i=1;i<nour;i++)
      {
    	  String u=rsh.getCell(0,i).getContents();
    	  String uc=rsh.getCell(1,i).getContents();
    	  String p="";
    	  String pc="";
    	  
    		if(uc.equals("valid"))
    	{
    		rsh.getCell(2,i).getContents();
    		rsh.getCell(3,i).getContents();
    			
    	  }
    	  if(u.equals("valid"))driver.findElement(By.name("identifier")).sendKeys(u);
    	  Label l1=new Label(nouc,i,"testpassed");
    	  
    	  Thread.sleep(5000);
    	  if(p.equals("valid"))driver.findElement(By.name("password")).sendKeys(p,Keys.ENTER);
    	  Thread.sleep(5000);
    	  if(pc.equals("valid")&&driver.findElement(By.name("password")).isDisplayed())
    	  {
    		 Label l2=new Label(nouc,i,"test passed");
    		 
    	  }
    	  
    	  
      }
  }

}
