package productAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch 
{
 public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium2\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		System.out.println("browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("borswer is maximized");
		
		//1.Amazon url open
	    driver.get("https://amazon.in");
	    System.out.println("url is opened");
			  
	    //2.Product search
	    WebElement searchBox= driver.findElement(By.xpath("//input[@type='text']"));
		searchBox.sendKeys("Wrist Watches");
		System.out.println("Product Name entered");
		
        WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        searchButton.click();
        System.out.println("clicked on searchButton");
        
        //Display:- Analogue
        WebElement displayAn = driver.findElement(By.xpath("a-size-base a-color-base"));
        displayAn.click();
        System.out.println("Clicked on Analogue Checkbox");
        
        WebElement materialLeather_checkbox  = driver.findElement(By.xpath("//span[contains(text(), 'Leather')]/preceding-sibling::span[@class='a-size-base a-color-base']"));
        materialLeather_checkbox.click();
        System.out.println("Clicked on Leather Checkbox");
        
        WebElement brandTitan_checkbox = driver.findElement(By.xpath("//span[contains(text(), 'Titan')]/preceding-sibling::span[@class='a-size-base a-color-base']"));
        brandTitan_checkbox.click();
        
        WebElement discount25_checkbox = driver.findElement(By.xpath( "//span[contains(text(), '25% Off or more')]/preceding-sibling::span[@class='a-size-base a-color-base']"));
        discount25_checkbox.click();
        System.out.println("clicked on 25%discount checkbox");
       
        //3.Get the Fifth Element from the search 
        WebElement fifthElement = driver.findElement(By.cssSelector("[data-component-type='s-search-result']:nth-child(5)"));
        System.out.println(fifthElement.getText());
       
        driver.close();
        System.out.println("browser is closed");
        
        }
}
