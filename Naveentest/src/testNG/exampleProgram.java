package testNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class exampleProgram {

	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\navee\\Downloads\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/frames");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");

		/*
		 * WebElement textBox1= driver.findElement(By.name("firstname"));
		 * textBox1.sendKeys("Ajith kumar");
		 * 
		 * WebElement GenderMaleCheckbox= driver.findElement(By.id("sex-0"));
		 * GenderMaleCheckbox.click();
		 * 
		 * WebElement dropdownn= driver.findElement(By.id("continents"));
		 * dropdownn.sendKeys("North America");
		 * 
		 * WebElement dropdown = driver.findElement(By.id("continents")); Select select
		 * = new Select(dropdown); List<WebElement> option= select.getOptions(); int
		 * size=option.size(); System.out.println(size);
		 */

		WebElement button= driver.findElement(By.id("submit"));
		button.click();
		
		
		
		// WebElement find=driver.findElement(By.id("textID"));
		// Thread.sleep(3000);
		// find.clear();
		// find.sendKeys("naveen");

	}

}
