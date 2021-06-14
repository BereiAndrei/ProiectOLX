package Help;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementMethods {

    public WebDriver driver;

    public ElementMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void HoverElement(WebElement element) {
        EnsurePresenceOfElement(element);
        Actions Action = new Actions(driver);
        Action.moveToElement(element).build().perform();
    }

    public void ScrollIntoElement(WebElement element){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void ClickElement(WebElement element) {
        EnsurePresenceOfElement(element);
        element.click();
    }

    public void ClickJavascriptElement(WebElement element){
        EnsurePresenceOfElement(element);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void FillElement(WebElement element, String Value) {
        element.sendKeys(Value);
    }

    public void SelectElementByText(WebElement element, String Value) {
        Select Select = new Select(element);
        Select.selectByVisibleText(Value);
    }

    public void SelectElementByValue(WebElement element, String Value) {
        Select Select = new Select(element);
        Select.selectByValue(Value);
    }

    public void EnsurePresenceOfElement(WebElement element){
        boolean ok = true;
        while (ok){
            try {
                if(element.isDisplayed()){
                    ok = false;
                }
            }
            catch (NoSuchElementException ignored){}
        }
    }

    public void EnsurePresenceOfElement(By identificator){
        boolean ok = true;
        while (ok){
            try {
                if(driver.findElement(identificator).isDisplayed()){
                    ok = false;
                }
            }
            catch (NoSuchElementException ignored){}
        }
    }

    public void EnsurePresenceOfElements(By identificator){
        int initialSize = 0;
        while (initialSize == 0){
            initialSize = driver.findElements(identificator).size();
        }
    }
}
