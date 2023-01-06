package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSeleniumBasics {

	public static void main(String[] args) {
		 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/");
		 driver.manage().window().maximize();
		 String title = driver.getTitle();
		 System.out.println(title);
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 String title1 = driver.getTitle();
		 System.out.println(title1);
		 driver.close();
		 
		 }

}
