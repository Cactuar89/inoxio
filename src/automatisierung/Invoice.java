package automatisierung;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Invoice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		//Aufruf und Login
		
		String URL = "https://challenge:3XvnAoF!9fJ5@challenge.inoxio.de";
		driver.get(URL);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//Wechsel zu Rechnungen
		
		Thread.sleep(1000);
		
		//driver.get("https://challenge.inoxio.de/invoices");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/ul/li[2]/a")).click();
				
		Thread.sleep(1000);
		
		//Neue Rechnung		
		//driver.findElement(By.className("add")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/ul/li/a")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/fieldset[1]/ol/li[5]/div[1]/input")).sendKeys("5000");
		
		//Rechnung erstellen
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/p/button")).click();
		
		

		
		
	
		
		
		
		
		

		
		

	}

}
