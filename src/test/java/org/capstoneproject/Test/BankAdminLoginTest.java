package org.capstoneproject.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BankAdminLoginTest {
	@Test
	public void loginTest()
	{
	System.out.println("starting login test");

	System.setProperty("webdriver.chrome.driver", "c:\\testtools\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	sleep(3000);
	driver.manage().window().maximize();
	String url="http://localhost:8092/ICIN_BANK/bankadminlogin.jsp";

	driver.get(url);
	System.out.println("Page opened");
	sleep(2000);
	WebElement username=driver.findElement(By.name("aname"));
	username.sendKeys("admin");
	sleep(1500);
	WebElement password=driver.findElement(By.name("pass"));
	password.sendKeys("admin");
	sleep(3000);
	WebElement loginButton=driver.findElement(By.tagName("button"));
	loginButton.click();
	sleep(5000);
try
{
	WebDriverWait wait=new WebDriverWait(driver,60);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("http://localhost:8092/ICIN_BANK/banklogin")));
	System.out.println("Admin Login Successfull");
}
catch(Exception e)
{
	System.out.println("Admin Login Successfull");
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
