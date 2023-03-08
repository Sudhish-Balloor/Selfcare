package com.primesophic.selfcare.patientsignup;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Test\\Maven\\Selfcare\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='container_users']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'New User')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("createUserPanel_firstNameField")).sendKeys("Sudhish");
		driver.findElement(By.id("createUserPanel_middleNameField")).sendKeys("M");
		driver.findElement(By.id("createUserPanel_lastNameField")).sendKeys("Balloor");
		driver.findElement(By.id("createUserPanel_emailField")).sendKeys("sudhish44544@gmail.com");
		
		Select dd = new Select(driver.findElement(By.xpath("//div[@class='simpleListMenuButton components_userGroupSelectorMenu emptyList notEmpty']")));
		dd.selectByVisibleText("Quality Control");
		
		driver.findElement(By.xpath("//span[@class='checkmark '][3]")).click();
		
		
	}

}
