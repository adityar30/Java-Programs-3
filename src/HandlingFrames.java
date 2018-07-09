import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe"); // initialize Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		//driver.switchTo().frame(0);
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		//driver.switchTo().frame("iframe1");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@name='iframe1']")));
		/*WebElement DragElement=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		Actions a= new Actions(driver);*/
		WebElement Username=driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input"));
		Username.sendKeys("Test");
		driver.switchTo().defaultContent();
		
		driver.close();
		driver.quit();
		
	}

}
