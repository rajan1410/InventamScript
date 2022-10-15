package Project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Inventam {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		
		 System.setProperty("webdriver.gecko.driver", "/Users/rajanpadhiyar/eclipse-workspace/SeleniumJars/geckodriver");
			
			FirefoxDriver driver = new FirefoxDriver();
			
			driver.get("https://www.easemytrip.com/");
			
			
			driver.findElement(By.id("a_FromSector_show")).sendKeys("Surat");
			driver.findElement(By.id("a_Editbox13_show")).sendKeys("Mumbai");
			driver.findElement(By.xpath("//body/form[@id='frmHome']/div[@class='top_bg_ofr']/div[@id='divNewSearchEngine']/div[@class='innerwrapSE']/div[@id='showOWRT']/div[@class='nwsearch_wrap']/div[@class='fss_flex search_colm']/button[1]")).click();
		
			Thread.sleep(3000);
			
			
			List<WebElement> searchResults = driver.findElements(By.xpath("//div[@id='0']"));
			System.out.println(searchResults.size());
			
			for(WebElement a : searchResults) {
				System.out.println(a.getText());
			}
			
			
	}

}
