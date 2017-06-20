package automatisierung;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Customer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		//Aufruf und Login
		
		String URL = "https://challenge:3XvnAoF!9fJ5@challenge.inoxio.de";
		driver.get(URL);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//Wechsel zu Kunden
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/ul/li[3]/a")).click();
				
		Thread.sleep(1000);
		
		//Neuer Kunde
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/ul/li/a")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/fieldset[1]/ol/li[2]/input")).sendKeys("PixelBros SE");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/fieldset[1]/ol/li[3]/input")).sendKeys("PB SE");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/fieldset[2]/ol/li[2]/input")).sendKeys("Patrick Kirst");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/fieldset[3]/ol/li[1]/input")).sendKeys("Alfred-Delp-Ring 24");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/fieldset[3]/ol/li[2]/input")).sendKeys("Erfurt");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/fieldset[3]/ol/li[3]/input")).sendKeys("99087");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/fieldset[4]/ol/li[1]/input")).sendKeys("patrick@pixelbros.de");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/fieldset[4]/ol/li[2]/input")).sendKeys("01741703965");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/fieldset[4]/ol/li[4]/input")).sendKeys("www.pixelbros.de");
		
		//Kunden erstellen
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/p/button")).click();
	}
}