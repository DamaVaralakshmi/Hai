package exam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\varalakshmi.dama\\eclipse-workspace\\Basic\\chrome\\chromedriver.exe");
		 WebDriver d1;
		 d1=new ChromeDriver();
		 d1.get("http://demo.automationtesting.in/Register.html");
  	 
		 
  }
}
