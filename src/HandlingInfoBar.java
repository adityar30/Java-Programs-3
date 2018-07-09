import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingInfoBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe"); // initialize Chrome browser
		
		
		ChromeOptions d=new ChromeOptions();
		d.addArguments("disable-infobars");
		//d.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(d);
	driver.manage().window().maximize();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		driver.close();
		driver.quit();
		
		
		
	}

}
