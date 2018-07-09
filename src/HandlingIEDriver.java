import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HandlingIEDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver", "E:\\Selenium\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		//driver.manage().window().maximize();
	//	Thread.sleep(2000);
		String Url="http://www.google.com";
		driver.get(Url);
		
		
		driver.close();
		driver.quit();

	}

}
