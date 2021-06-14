package Base;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseOLX {

    public WebDriver driver;

    @Before

    public void Setup(){

        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.olx.ro/");
        driver.manage().window().maximize();
    }

}
