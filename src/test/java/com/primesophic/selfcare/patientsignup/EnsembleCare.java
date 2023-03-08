package com.primesophic.selfcare.patientsignup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EnsembleCare {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Test\\Maven\\Selfcare\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		driver.get("http://18.217.173.1/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(500);
		
		//Landing page - old
		driver.findElement(By.xpath("//button[@type='button'][2]")).click();
		Thread.sleep(500);
		
		//Therapy selection		
		driver.findElement(By.id("Individual")).click();
		Thread.sleep(500);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		Thread.sleep(500);
		
		//Questionnaire
		driver.findElement(By.xpath("//button[@onclick='submitDetailsForm(this,9)']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[@onclick='submitDetailsForm(this,6)']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[@onclick='submitDetailsForm(this,1)']")).click();
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[@onclick='submitDetailsForm(this,2)']")).click();
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[@onclick='submitDetailsForm(this,3)']")).click();
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[@onclick='submitDetailsForm(this,4)']")).click();
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[@onclick='submitDetailsForm(this,1)']")).click();
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[@onclick='submitDetailsForm(this,2)']")).click();
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[@onclick='submitDetailsForm(this,3)']")).click();
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		Thread.sleep(500);
		
		//Sign Up
		driver.findElement(By.id("firstName")).sendKeys("Testing");
		Thread.sleep(500);
		driver.findElement(By.id("middleName")).sendKeys("Patient");
		Thread.sleep(500);
		driver.findElement(By.id("lastName")).sendKeys("17");
		Thread.sleep(500);
		
		WebElement Gender = driver.findElement(By.id("gender"));
		Select dropdown = new Select(Gender);
		dropdown.selectByVisibleText("Male");
		Thread.sleep(500);
		
		driver.findElement(By.id("dob")).sendKeys("12/12/1996");
		Thread.sleep(500);
		
		driver.findElement(By.id("phone")).sendKeys("9633952776");
		Thread.sleep(500);
		
		driver.findElement(By.id("email")).sendKeys("Testingpatient17@gmail.com");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys("Admin@123");
		Thread.sleep(500);
		
		driver.findElement(By.id("confirmpass")).sendKeys("Admin@123");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[@onclick='continue_next()']")).submit();
		Thread.sleep(3000);
		
		//Get OTP
		String altText=driver.switchTo().alert().getText();
		System.out.println(altText);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		//Split message
		String split="[^\\d]+";
		String[] OTP =altText.split(split);
		System.out.println(OTP[1]);

						
		//Input OTP and validate
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys(OTP[1]);
		
		//Selection Of Plan - Plus Premium
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='location.href=`/payments/payment_choice/?plan=Premium` ']")).click();
		Thread.sleep(5000);
		
		//Payment 
		/*
		//SelfPay
		driver.findElement(By.xpath("//button[text()='Debit/Credit Card']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("cardNumber")).sendKeys("4242424242424242");
		Thread.sleep(1000);
		driver.findElement(By.id("cardExpiry")).sendKeys("1225");
		Thread.sleep(1000);
		driver.findElement(By.id("cardCvc")).sendKeys("123");
		Thread.sleep(1000);
		driver.findElement(By.id("billingName")).sendKeys("Testing");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='SubmitButton-IconContainer']")).click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='location.href=`/patient/dashboard/`']")).click();
		Thread.sleep(1000);
		*/
		
		//Insurance Pay
		driver.findElement(By.xpath("//button[text()='Take me to Insurance Details Page']")).click();
		WebElement Insurance_company=driver.findElement(By.id("company"));
		Select dd=new Select(Insurance_company);
		dd.selectByIndex(2);
		Thread.sleep(500);
		driver.findElement(By.id("plan")).sendKeys("1234");
		Thread.sleep(500);
		driver.findElement(By.id("member")).sendKeys("98765");
		Thread.sleep(500);
		driver.findElement(By.id("group")).sendKeys("00235");
		Thread.sleep(500);
		driver.findElement(By.id("memeber_name")).sendKeys("Testing");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(500);
		driver.findElement(By.id("photo")).sendKeys("D:\\Test\\Maven\\Image.jpg");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@id='remove']")).click();
		Thread.sleep(500);
		driver.findElement(By.id("photo")).sendKeys("D:\\Test\\Maven\\Image.jpg");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[contains(text(),'Verify the Details')]")).click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=\"Continue\"]")).click();
		Thread.sleep(1000);
		
	}

}
