package newjava;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class java {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:\\Drivers\\geckodriver.exe");
//		Thread.sleep(2000);
//		ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
//		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElementById("id=\"email\")").sendKeys("pramodpanjala@gmail.com");
		driver.findElementById("pass").sendKeys("pramod@123");

	}

}
