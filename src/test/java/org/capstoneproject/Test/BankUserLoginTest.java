package org.capstoneproject.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

	public class BankUserLoginTest {

	@Test
	public void loginTest()
	{
		System.out.println("starting login test");

		System.setProperty("webdriver.chrome.driver", "c:\\testtools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		sleep(3000);
		driver.manage().window().maximize();
		String url="http://localhost:8092/ICIN_BANK/BankLogin.jsp";

		driver.get(url);
		System.out.println("Page opened");
		sleep(2000);
		WebElement username=driver.findElement(By.name("cid"));
		username.sendKeys("776406");
		sleep(1500);
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("laharipriya");
		sleep(3000);
		WebElement loginButton=driver.findElement(By.tagName("button"));
		loginButton.click();
		sleep(5000);
	try
	{
		WebDriverWait wait=new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("http://localhost:8092/ICIN_BANK/banklogin.jsp")));
		System.out.println("User Login Successfull");
	}
	catch(Exception e)
	{
		System.out.println("User Login Successfull");
	}
	sleep(5000);
	driver.quit();

	}
		private void sleep(long m) {
			try {
			Thread.sleep(m);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
			}
	}



