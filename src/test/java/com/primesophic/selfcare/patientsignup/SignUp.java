package com.primesophic.selfcare.patientsignup;

import java.awt.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.apache.commons.lang3.math.NumberUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.jna.StringArray;
import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Message;

public class SignUp {
	
	private static final String[] OTP = null;

	//public static final String ACCOUNT_SID = "AC93f0471640d9bfe31d47b55e6f900070";
	//public static final String AUTH_TOKEN = "ebf4c3de4dd8583e59f71358ee676482";
	//public static int sum=0;

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
		
		driver.findElement(By.xpath("//button[@type='button'][2]")).click();
		Thread.sleep(500);
		
		driver.findElement(By.id("next")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[@onclick='submitDetailsForm(9)']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[@onclick='submitDetailsForm(6)']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[@onclick='submitDetailsForm(1)']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[@onclick='submitDetailsForm(2)']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[@onclick='submitDetailsForm(3)']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[@onclick='submitDetailsForm(4)']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[@onclick='submitDetailsForm(1)']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[@onclick='submitDetailsForm(2)']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[@onclick='submitDetailsForm(3)']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.id("firstName")).sendKeys("Leon");
		Thread.sleep(500);
		driver.findElement(By.id("middleName")).sendKeys("Henrry");
		Thread.sleep(500);
		driver.findElement(By.id("lastName")).sendKeys("R");
		Thread.sleep(500);
		
		WebElement Gender = driver.findElement(By.id("gender"));
		Select dropdown = new Select(Gender);
		dropdown.selectByVisibleText("Male");
		Thread.sleep(500);
		
		driver.findElement(By.id("dob")).sendKeys("12/12/1996");
		Thread.sleep(500);
		
		driver.findElement(By.id("ssn")).sendKeys("900100708");
		Thread.sleep(500);
		
		driver.findElement(By.id("phone")).sendKeys("9633952708");
		Thread.sleep(500);
		
		driver.findElement(By.id("email")).sendKeys("Leon708@gmail.com");
		Thread.sleep(500);
		
		driver.findElement(By.id("password")).sendKeys("Selfcare@123");
		Thread.sleep(500);
		
		driver.findElement(By.id("confirmpass")).sendKeys("Selfcare@123");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Thread.sleep(3000);
		
		//Get OTP
		String altText=driver.switchTo().alert().getText();
		System.out.println(altText);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		//Split message
		
		//String OTPNumber = altText.replaceAll("[^-?0-9]+", " ");
		String split="[^\\d]+";
		String[] OTP =altText.split(split);
		System.out.println(OTP[1]);
		int  intArray[] = new int[4];
		
		Integer intValue = NumberUtils.toInt(OTP[1]);
		//Conversion
		
		//intArray[1]=NumberUtils.toInt(OTP[1]);
		System.out.println(intArray[1]+10);
		
		//Testing
		
		int a,b,c,d,i=0;
		for(i=1;i<=4;i++)
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			if (i==1){
				 a = intValue%10;
				 System.out.println(a);
				 WebElement input=driver.findElement(By.id("fourth"));
				 js.executeScript("arguments[0].value='"+a+"';", input);
				 Thread.sleep(500);
			}
			if(i==2) {
				b = intValue%10;
				System.out.println(b);
				WebElement input=driver.findElement(By.id("third"));
				 js.executeScript("arguments[0].value='"+b+"';", input);
				 Thread.sleep(500);
			}
			if(i==3) {
				c = intValue%10;
				System.out.println(c);
				WebElement input=driver.findElement(By.id("second"));
				 js.executeScript("arguments[0].value='"+c+"';", input);
				 Thread.sleep(500);
			}
			if(i==4) {
				d = intValue%10;
				System.out.println(d);
				WebElement input=driver.findElement(By.id("first"));
				 js.executeScript("arguments[0].value='"+d+"';", input);
				 Thread.sleep(500);
			}

		intValue=intValue/10;
		}

		
		
		
				
		
		//Input OTP and validate
				
		
		//driver.findElement(By.cssSelector("//input[@id='first']")).sendKeys(OTP[1]);
		//sud.sendKeys(intValue);
		
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//WebElement input=driver.findElement(By.xpath("//input[@type='text']"));
		//js.executeScript("arguments[0].value='" + Long.parseLong(OTP[1]) + "';", input);
		//js.executeScript("arguments[0].value=arguments[1].value",input,intValue);
		//js.executeScript("arguments[0].value=arguments[1].value",input,convertStringToInt(OTP[1]));
		//js.executeScript("document.getElementById('" + input + "').value ='" + intValue + "'");
		
		
		Thread.sleep(3000);
		driver.findElement(By.id("submit_btn")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}

}
	
