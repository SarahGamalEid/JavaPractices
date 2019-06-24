package AutomationFramework.FirstDay;

import java.util.List;
import java.util.concurrent.TimeUnit; // add becasue of driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;  //SearchBox.sendKeys(Keys.ENTER);
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SarahGamal\\Downloads\\chromedriver_win32\\chromedriver.exe");

	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.google.com");
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  WebElement SearchBox =  driver.findElement(By.name("q"));
	  SearchBox.sendKeys("Automation");
	  
	  SearchBox.sendKeys(Keys.ENTER);
	  
	  List<WebElement> elements = driver.findElements(By.className("LC20lb"));
	    System.out.println("Number of elements:" +elements.size());

	    for (int i=0; i<elements.size();i++){
	      //System.out.println("link text:" + elements.get(i).getAttribute("value"));
	      //System.out.println("Font size of links:" + elements.get(i).getCssValue("font-size"));
	      
	     String font1stelement  =elements.get(i).getCssValue("font-size");
	     
	      if (font1stelement.equals("18px"))
	    	  
	      { System.out.println("this style of link text is correct:"+i+"_"+ elements.get(i).getText());}
	      
	      if (!font1stelement.equals("18px"))
	      {
	    	  System.out.println("this style of link text is not correct:"+i+"_"+ elements.get(i).getText());
	      }
	      
	      
	      
	    }
	  
	  
	 /* 
	  //Read font-size property and print It In console.
	  String fontSize = text.getCssValue("font-size");
	  System.out.println("Font Size -> "+fontSize);
	  
	  //Read color property and print It In console.
	  String fontColor = text.getCssValue("color");
	  System.out.println("Font Color -> "+fontColor);
	  
	  //Read font-family property and print It In console.
	  String fontFamily = text.getCssValue("font-family");
	  System.out.println("Font Family -> "+fontFamily);
	  
	  //Read text-align property and print It In console.
	  String fonttxtAlign = text.getCssValue("text-align");
	  System.out.println("Font Text Alignment -> "+fonttxtAlign);
	  
	  */
	  
  }
}
