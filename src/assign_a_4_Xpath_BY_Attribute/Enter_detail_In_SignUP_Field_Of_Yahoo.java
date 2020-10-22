package assign_a_4_Xpath_BY_Attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enter_detail_In_SignUP_Field_Of_Yahoo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();  //For Firefox
		//OR
		//WebDriver driver=new FirefoxDriver();   //Up casting. organization used this
		//or   For IE
		/*System.setProperty("webdriver.ie.driver", "D:/QSSE10/IEDriverServer_x64_2.52.0/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/account/create?specId=yidReg");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Ravi");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Sah");
		driver.findElement(By.xpath("//input[@name='yid']")).sendKeys("ravi004@yahoo.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ravi253567");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("988899877");
		driver.findElement(By.xpath("//select[@name='mm']")).sendKeys("April");
		driver.findElement(By.xpath("//input[@name='dd']")).sendKeys("25");
		driver.findElement(By.xpath("//input[@name='yyyy']")).sendKeys("1996");
		driver.findElement(By.xpath("//input[@name='freeformGender']")).sendKeys("Male");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
		

	}

}
