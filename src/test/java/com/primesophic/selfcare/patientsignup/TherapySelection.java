package com.primesophic.selfcare.patientsignup;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TherapySelection {

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
				
				//Therapy Selection
				driver.findElement(By.xpath("//button[@type='button'][2]")).click();
				Thread.sleep(500);
				
				//Questionnaire
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
				
				//Sign Up
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
				
				driver.findElement(By.id("ssn")).sendKeys("900100758");
				Thread.sleep(500);
				
				driver.findElement(By.id("phone")).sendKeys("9633952758");
				Thread.sleep(500);
				
				driver.findElement(By.id("email")).sendKeys("Leon758@gmail.com");
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
				String split="[^\\d]+";
				String[] OTP =altText.split(split);
				System.out.println(OTP[1]);
		
								
				//Input OTP and validate
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys(OTP[1]);
				Thread.sleep(1000);
				driver.findElement(By.id("submit_btn")).click();
				Thread.sleep(3000);
				
				//Selection Of Plan - Standard Plus Premium
				driver.findElement(By.xpath("//button[contains(@onclick,'Standard')]")).click();
				Thread.sleep(3000);
				
				/*
				//Payment
				//Insurance Pay
				driver.findElement(By.xpath("//button[contains(text(),'Insurance')]")).click();
				WebElement Insurance_company=driver.findElement(By.id("company"));
				Select dd=new Select(Insurance_company);
				dd.selectByIndex(2);
				Thread.sleep(1000);
				driver.findElement(By.id("plan")).sendKeys("1234");
				Thread.sleep(1000);
				driver.findElement(By.id("member")).sendKeys("98765");
				Thread.sleep(1000);
				driver.findElement(By.id("group")).sendKeys("00235");
				Thread.sleep(1000);
				driver.findElement(By.id("memeber_name")).sendKeys("Leaon");
				Thread.sleep(3000);
				driver.findElement(By.id("photo")).sendKeys("D:\\Test\\Maven\\Image.jpg");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[@id='remove']")).click();
				Thread.sleep(3000);
				driver.findElement(By.id("photo")).sendKeys("D:\\Test\\Maven\\Image.jpg");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[contains(text(),'Success')]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[text()=' Proceed Next ']")).click();
				Thread.sleep(1000);
				
				*/
				
				//SelfPay
				driver.findElement(By.xpath("//button[contains(text(),'I will pay')]")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("cardNumber")).sendKeys("4242424242424242");
				Thread.sleep(1000);
				driver.findElement(By.id("cardExpiry")).sendKeys("1225");
				Thread.sleep(1000);
				driver.findElement(By.id("cardCvc")).sendKeys("123");
				Thread.sleep(1000);
				driver.findElement(By.id("billingName")).sendKeys("Leona");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[@class='SubmitButton-IconContainer']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[text()=' Proceed Next ']")).click();
				Thread.sleep(1000);
				
				//Therapy Selection
				driver.findElement(By.xpath("//button[contains(text(),'Appointment')]")).click();
				Thread.sleep(1000);
				
					
				
				//Date and Time Slot Selection
				//driver.findElement(By.xpath("//a[@aria-label='September 9, 2022']")).click();
				DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
				Date systemdate = new Date();
				String date1= dateFormat.format(systemdate);
				System.out.println(date1);
				
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
				driver.findElement(By.xpath("//button[@value='153']")).click();
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
				//driver.findElement(By.id("sig-clearBtn")).click();
				//Thread.sleep(2000);
				//driver.switchTo().alert().accept();
				//Thread.sleep(2000);
				//actions.dragAndDropBy(Signature, 200, 0).build().perform();
				//Thread.sleep(2000);
				driver.findElement(By.id("consent-btn")).click();
				Thread.sleep(2000);
				
				
				
				
				

	}

}
