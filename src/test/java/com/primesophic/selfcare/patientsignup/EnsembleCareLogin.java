package com.primesophic.selfcare.patientsignup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class EnsembleCareLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Test\\Maven\\Selfcare\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		//executor.executeScript("document.body.style.zoom = '80%'");
		//Thread.sleep(500);
		
		//Login
		driver.get("http://18.217.173.1/patient/login/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(500);
		
		//Dimension currentDimension = driver.manage().window().getSize();
		//int height = currentDimension.getHeight();
		//int width = currentDimension.getWidth();
		//System.out.println("Current height: "+ height);
		//System.out.println("Current width: "+width);
		
		//set the size
		//driver.manage().window().setSize(new Dimension(696,1296));
		
					  
		driver.findElement(By.id("id_username")).sendKeys("Laur12@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.id("id_password")).sendKeys("Admin@123");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(500);
		
		/*
		
		//Make an appointment
		//Client Availability
		driver.findElement(By.xpath("//p[contains(text(),'Make an ')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[text()='Monday ']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[text()='Tuesday']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[text()='Wednesday']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[text()='Thursday']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[text()='Friday  ']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[text()='Saturday']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[text()='Sunday']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//label[text()='Morning']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[text()='Afternoon']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[text()='Evening']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='Confirm Availability']")).click();
		
		//Provider matching
		driver.findElement(By.xpath("//div[@data-bs-target='#tab_3']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,550)", "");
		//Thread.sleep(500);
		//driver.findElement(By.xpath("//button[contains(text(),'Confirm Provider')]")).submit();
		WebElement sub= driver.findElement(By.id("provider_btn"));
		
		 js.executeScript("arguments[0].scrollIntoView();", sub);
		 Thread.sleep(500);
		 sub.click();
		 
		 //Call Type
		 driver.findElement(By.xpath("//img[@data-call_type='Audio']")).click();
		 Thread.sleep(500);
		 driver.findElement(By.xpath("//img[@data-call_type='Video']")).click();
		 Thread.sleep(500);
		 /*
		 driver.findElement(By.id("pres1_label")).sendKeys("D:\\Test\\Maven\\Prescription1.jpg");
		  
		 Thread.sleep(500);
		 driver.findElement(By.id("pres2_label")).sendKeys("D:\\Test\\Maven\\Prescription2.jpg");
		 Thread.sleep(500);
		 driver.findElement(By.id("pres3_label")).sendKeys("D:\\Test\\Maven\\Prescription3.jpg");
		 Thread.sleep(500);
		 */
		/*
		 driver.findElement(By.id("call_confirm")).click();
		 
		 //Final Review
		 
		 Thread.sleep(4000);
		 WebElement Sign = driver.findElement(By.id("sig-canvas"));
		 js.executeScript("arguments[0].scrollIntoView();", Sign);
		js.executeScript("window.scrollBy(0,-1000)", "");
			Thread.sleep(2000);
			Actions actions=new Actions(driver);			
			actions.dragAndDropBy(Sign, 200, 0).build().perform();
			Thread.sleep(2000);
			driver.findElement(By.id("consent-btn")).click();
			Thread.sleep(500);
		 
			driver.findElement(By.xpath("//button[text()='Done']")).click();
			
		*/
		driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/a/img")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"addbutton\"]/img")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/form/div[1]/input")).sendKeys("Testing");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"floatingTextarea\"]")).sendKeys("This is my first Journal");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/form/div[3]/button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/form/button/img")).click();
	}

}
