package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search AJIO']"));
		search.sendKeys("bags", Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(5000);
		WebElement bagCount = driver.findElement(By.xpath("//div[@class='length']"));
		System.out.println(bagCount.getText());
		List<WebElement> bagBrandList = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println(bagBrandList.size());
		for (WebElement brandList : bagBrandList) {
			String text = brandList.getText();
			System.out.println(text);

		}
		List<WebElement> bagNames = driver.findElements(By.className("nameCls"));
		System.out.println(bagNames.size());
		for (WebElement names : bagNames) {
			String nameText = names.getText();
			System.out.println(nameText);
		}

	}

}
