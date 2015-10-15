import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class sample1 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://epedia.co.in");
		WebElement block=driver.findElement(By.id("hotel-1-children"));
        List<WebElement> links=block.findElements(By.tagName("option"));
        for(int i=1;i<links.size();i++){
        	links.get(i).click();
        	if(links.get(i).isSelected()){
        		String x=links.get(i).getText();
        		int y=Integer.parseInt(x);
        		Thread.sleep(2000);
        		WebElement block1=driver.findElement(By.xpath("/html/body/section/div/div/div/div/section/div[1]/div/div/form/div/section/div/div[1]/fieldset[2]/div/div/div/fieldset[2]"));
        		List<WebElement> links1=block1.findElements(By.tagName("label"));
        		int size=links1.size();
        		if(y == size){
        			System.out.println("working correctly");
        			
        		}
        		else{
        			System.out.println("Not working properly");
        		}
        		 block=driver.findElement(By.id("hotel-1-children"));
        	        links=block.findElements(By.tagName("option"));
        	}
        }

	}

}
