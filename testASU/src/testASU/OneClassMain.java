package testASU;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver(); 
driver.get("https://srv-asugf/index.jsp");
WebElement LoginUser = driver.findElement(By.id("login"));
LoginUser.sendKeys("root");;
WebElement PassUser = driver.findElement(By.id("password"));
PassUser.sendKeys("toor");;
WebElement IncomeButton = driver.findElement(By.id("submit"));
IncomeButton.click();
	}
}
