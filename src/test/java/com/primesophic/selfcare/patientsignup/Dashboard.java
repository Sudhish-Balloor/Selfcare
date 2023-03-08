package com.primesophic.selfcare.patientsignup;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dashboard {

	public static void main(String[] args) throws InterruptedException {
		
		//EdgeBrowser
		//System.setProperty("webdriver.edge.driver","D:\\Test\\Selfcare-Modules\\msedgedriver.exe");
		//WebDriver driver=new EdgeDriver();
		
		//ChromeBrowser
		System.setProperty("webdriver.chrome.driver","D:\\Test\\Selfcare-Modules\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		//URL
		driver.get("http://18.217.173.1/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(500);
		
		//Login
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(500);
		driver.findElement(By.id("floatingInput")).sendKeys("Leon752@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.id("floatingPassword")).sendKeys("Selfcare@123");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(500);
		
		
		//Videos
		driver.findElement(By.xpath("//a[@href=\"/patient/dashboard/videos/\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/-8N9UR6OTCs']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/-8N9UR6OTCs']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/BpzVvUGfJeA']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/BpzVvUGfJeA']")).click();
		Thread.sleep(500);
		
		
		//Articles
		driver.findElement(By.xpath("//a[@href='/patient/dashboard/articles/']")).click();
		Thread.sleep(1000);
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='View More']")).click();
		Thread.sleep(6000);	
		driver.switchTo().window(parent);
		Thread.sleep(1000);
		
		
		
		//Journals
		driver.findElement(By.xpath("//a[@href='/patient/dashboard/journals/']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Add +']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Leave a comment here']")).sendKeys("Diet Journals");
		Thread.sleep(1000);
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
		Date systemdate = new Date();
		String date1= dateFormat.format(systemdate);
		System.out.println(date1);
		driver.findElement(By.xpath("//input[@placeholder='Date']")).sendKeys(date1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@placeholder='Leave a comment here']")).sendKeys("Skip Breakfast");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		
		
		
		//Goals
		driver.findElement(By.xpath("//a[@href='/patient/dashboard/goals/']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Leave a comment here']")).sendKeys("Diet");
		Thread.sleep(1000);
		WebElement duration = driver.findElement(By.id("floatingSelect"));
		Select dd1=new Select(duration);
		dd1.selectByIndex(2);
		Thread.sleep(1000);
		//DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
		//Date systemdate = new Date();
		String date2= dateFormat.format(systemdate);
		driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys(date2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@placeholder='Leave a comment here']")).sendKeys("Avoid Junky Foods");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		
		
	
		//Profile Update
		driver.findElement(By.xpath("//a[@href='/patient/dashboard/profile/']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("update-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='first_name']")).clear();
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Leaona");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='middle_name']")).clear();
		driver.findElement(By.xpath("//input[@name='middle_name']")).sendKeys("Henrried");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='last_name']")).clear();
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Kia");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='dob']")).clear();
		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("09/08/2002");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='emergency_phone']")).clear();
		driver.findElement(By.xpath("//input[@name='emergency_phone']")).sendKeys("9000234512");
		Thread.sleep(1000);
		WebElement martial= driver.findElement(By.id("marital_status2"));
		Select mm=new Select(martial);
		mm.selectByIndex(2);
		driver.findElement(By.xpath("//input[@name='referral_source']")).clear();
		driver.findElement(By.xpath("//input[@name='referral_source']")).sendKeys("Tom");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='address']")).clear();
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("California");
		Thread.sleep(1000);
		driver.findElement(By.id("submit-btn")).submit();
		
		
		
		//Coaches
		driver.findElement(By.xpath("//a[@href='/patient/dashboard/coaches/']")).click();
		Thread.sleep(1000);
		
		
		
		//Consult Now
		
		driver.findElement(By.xpath("//a[@href='/patient/dashboard/']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Consult')]")).click();
		Thread.sleep(1000);
		//Therapy Selection
		driver.findElement(By.xpath("//button[contains(text(),'Appointment')]")).click();
		Thread.sleep(1000);
		//Date and Time Slot Selection
		//DateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy ");
		//Date systemdate = new Date();
		String date3= dateFormat.format(systemdate);
		System.out.println(date3);
		
		String split1="[^\\d]+";
		String[] split_date =date1.split(split1);
		System.out.println(split_date[1]);
		
		List<WebElement> Dates = driver.findElements(By.xpath("//table[@class='fc-scrollgrid-sync-table']//tr//td"));
		int total_node=Dates.size();
		for(int j=0;j<total_node;j++)
		{
			String date=Dates.get(j).getText();
			System.out.println(date);
			
			if(date.equals(split_date[1]))
			{
				Dates.get(j).click();
				break;
			}
		}
		
		Thread.sleep(2000);				
		//Three available Time slot values are 
		driver.findElement(By.xpath("//button[contains(text(),'2 a.m.')]")).click();
		Thread.sleep(2000);
		//Final Review
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(2000);
		driver.findElement(By.id("preview-btn")).click();
		Thread.sleep(4000);
		//Consent form
		
		WebElement Signature = driver.findElement(By.id("sig-canvas"));
		js.executeScript("window.scrollBy(0,-1000)", "");
		Thread.sleep(2000);
		Actions actions=new Actions(driver);			
		actions.dragAndDropBy(Signature, 200, 0).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.id("consent-btn")).click();
		Thread.sleep(2000);
		
		
		//Video Call
		
		driver.findElement(By.xpath("//button[contains(text(),'Start Now')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("join")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("audio")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("audio")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("videos")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("videos")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("leave")).click();
		Thread.sleep(3000);
	}

}
