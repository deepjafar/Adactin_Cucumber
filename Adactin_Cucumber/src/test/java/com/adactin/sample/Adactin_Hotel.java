package com.adactin.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.baseclass.Adactin_Baseclass;


public class Adactin_Hotel extends Adactin_Baseclass {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		 driver = getBrowser("chrome");
		getUrl("https://adactinhotelapp.com/");
		
		driver.findElement(By.name("username")).sendKeys("deepjafar");
		driver.findElement(By.name("password")).sendKeys("Welcome@1");
		driver.findElement(By.id("login")).click();
		
		
		WebElement location = driver.findElement(By.id("location"));
		Select s=new Select(location);
		s.selectByIndex(8);
		Thread.sleep(3000);
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1=new Select(hotel);
		s1.selectByValue("Hotel Hervey");
		Thread.sleep(3000);
		
		WebElement room = driver.findElement(By.id("room_type"));
		Select s2=new Select(room);
		s2.selectByVisibleText("Deluxe");
		
		WebElement roomnos = driver.findElement(By.id("room_nos"));
		Select s3=new Select(roomnos);
		s3.selectByIndex(1);
		
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		
		driver.findElement(By.id("radiobutton_0")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("first_name")).sendKeys("Deepika");
		
		driver.findElement(By.id("last_name")).sendKeys("Jafar");
		
		driver.findElement(By.id("address")).sendKeys("Test address");
		Thread.sleep(3000);
		
		driver.findElement(By.id("cc_num")).sendKeys("1111111111111111");
		
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		Select s4=new Select(cardtype);
		s4.selectByIndex(4);
		
		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
		Select s5=new Select(expmonth);
		s5.selectByVisibleText("June");
		Thread.sleep(3000);
		
		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
		Select s6=new Select(expyear);
		s6.selectByValue("2013");
		
		driver.findElement(By.id("cc_cvv")).sendKeys("000");
		
		driver.findElement(By.id("book_now")).click();
	
		
	}
}
