package Teste;

import Base.BaseOLX;
import Help.ElementMethods;
import PropertyUtility.PropertyFile;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class OLXSearch extends BaseOLX {
    ElementMethods elementMethod;
    PropertyFile propertyFile;


    @Test
    public void Search() {
        elementMethod = new ElementMethods(driver);
        propertyFile = new PropertyFile("RegisterData");

        WebElement Cokies = driver.findElement(By.id("onetrust-accept-btn-handler"));
        elementMethod.HoverElement(Cokies);
        elementMethod.ClickElement(Cokies);

        elementMethod.EnsurePresenceOfElement(By.xpath("//span[@class='cat-icon cat-icon-circle cat-icon-5']"));
        WebElement CategoryWeb = driver.findElement(By.xpath("//span[@class='cat-icon cat-icon-circle cat-icon-5']"));
        elementMethod.HoverElement(CategoryWeb);
        elementMethod.ClickElement(CategoryWeb);

        elementMethod.EnsurePresenceOfElement(By.xpath("//div[@id='bottom5']//li[1]//a[1]//span[1]//span[1]"));
        WebElement SubcategoryWeb = driver.findElement(By.xpath("//div[@id='bottom5']//li[1]//a[1]//span[1]//span[1]"));
        elementMethod.HoverElement(SubcategoryWeb);
        elementMethod.ClickElement(SubcategoryWeb);

        elementMethod.EnsurePresenceOfElement(By.xpath("//div[@class='filter-item rel category-item']/a"));
        WebElement ModelWeb = driver.findElement(By.xpath("//div[@class='filter-item rel category-item']/a"));
        elementMethod.HoverElement(ModelWeb);
        elementMethod.ClickElement(ModelWeb);

        elementMethod.EnsurePresenceOfElements(By.xpath("//ul[@class='small suggestinput bgfff lheight20 br-3 abs subcategories binded']//a[@data-name]"));
        List<WebElement> ModelOptionsList = driver.findElements(By.xpath("//ul[@class='small suggestinput bgfff lheight20 br-3 abs subcategories binded']//a[@data-name]"));
        for (int index = 0; index < ModelOptionsList.size(); index++) {
            if (ModelOptionsList.get(index).getText().contains("Kia")) {
                elementMethod.HoverElement(ModelOptionsList.get(index));
                elementMethod.ClickElement(ModelOptionsList.get(index));
                break;
            }
        }

        elementMethod.EnsurePresenceOfElement(By.xpath("//div[@class='filter-item rel filter-item-model']"));
        WebElement CarModelWeb=driver.findElement(By.xpath("//div[@class='filter-item rel filter-item-model']"));
        elementMethod.HoverElement(CarModelWeb);
        elementMethod.ClickElement(CarModelWeb);

        elementMethod.EnsurePresenceOfElements(By.cssSelector("label[data-text='Sportage'] span"));
        WebElement CarModelList=driver.findElement(By.cssSelector("label[data-text='Sportage'] span"));
        elementMethod.HoverElement(CarModelList);
        elementMethod.ClickJavascriptElement(CarModelList);

        elementMethod.EnsurePresenceOfElements(By.xpath("//div[@class='filter-item filter-item-to rel numeric-item price']"));
        WebElement PriceTagWeb= driver.findElement(By.xpath("//div[@class='filter-item filter-item-to rel numeric-item price']"));
        elementMethod.HoverElement(PriceTagWeb);
        elementMethod.ClickElement(PriceTagWeb);

        elementMethod.EnsurePresenceOfElements(By.xpath("//a[contains(text(),'10000 €')]"));
        WebElement PriceUntilWeb= driver.findElement(By.xpath("//a[contains(text(),'10000 €')]"));
        elementMethod.HoverElement(PriceUntilWeb);
        elementMethod.ClickElement(PriceUntilWeb);

        elementMethod.EnsurePresenceOfElements(By.cssSelector("li[id='param_year'] div[class='filter-item filter-item-from rel numeric-item'] span[class='header block']"));
        WebElement YearFromWeb=driver.findElement(By.cssSelector("li[id='param_year'] div[class='filter-item filter-item-from rel numeric-item'] span[class='header block']"));
        elementMethod.HoverElement(YearFromWeb);
        elementMethod.ClickElement(YearFromWeb);

        elementMethod.EnsurePresenceOfElements(By.xpath("//a[normalize-space()='2010']"));
        WebElement YearFromValue=driver.findElement(By.xpath("//a[normalize-space()='2010']"));
        elementMethod.HoverElement(YearFromValue);
        elementMethod.ClickElement(YearFromValue);
    }
}












