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
        elementMethod.ClickElement(Cokies);

        WebElement CategoryWeb = driver.findElement(By.xpath("//span[@class='cat-icon cat-icon-circle cat-icon-5']"));
        elementMethod.ClickElement(CategoryWeb);

        new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='bottom5']//li[1]//a[1]//span[1]//span[1]")));
        WebElement SubcategoryWeb = driver.findElement(By.xpath("//div[@id='bottom5']//li[1]//a[1]//span[1]//span[1]"));
        elementMethod.ClickElement(SubcategoryWeb);


        new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='filter-item rel category-item']/a")));
        WebElement ModelWeb = driver.findElement(By.xpath("//div[@class='filter-item rel category-item']/a"));
        ModelWeb.click();

        new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@class='small suggestinput bgfff lheight20 br-3 abs subcategories binded']//a[@data-name]")));
        List<WebElement> ModelOptionsList = driver.findElements(By.xpath("//ul[@class='small suggestinput bgfff lheight20 br-3 abs subcategories binded']//a[@data-name]"));
        for (int index = 0; index < ModelOptionsList.size(); index++) {
            //System.out.println(ModelOptionsList.get(index).getText());
            if (ModelOptionsList.get(index).getText().contains("Kia")) {
                ModelOptionsList.get(index).click();
                break;
            }
        }

        new WebDriverWait(driver, 45).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='filter-item rel filter-item-model']")));
        WebElement CarModelWeb=driver.findElement(By.xpath("//div[@class='filter-item rel filter-item-model']"));
        elementMethod.ClickElement(CarModelWeb);

        new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("label[data-text='Sportage'] span")));
        WebElement CarModelList=driver.findElement(By.cssSelector("label[data-text='Sportage'] span"));
        elementMethod.ClickElement(CarModelList);

        
        WebElement PriceTagWeb= driver.findElement(By.xpath("//div[@class='filter-item filter-item-to rel numeric-item price']"));
        elementMethod.ClickElement(PriceTagWeb);

        WebElement PriceUntilWeb= driver.findElement(By.xpath("//a[contains(text(),'10000 €')]"));
        elementMethod.ClickElement(PriceUntilWeb);

        WebElement YearFromWeb=driver.findElement(By.cssSelector("li[id='param_year'] div[class='filter-item filter-item-from rel numeric-item'] span[class='header block']"));
        elementMethod.ClickElement(YearFromWeb);

        WebElement YearFromValue=driver.findElement(By.xpath("//a[normalize-space()='2010']"));
        elementMethod.ClickElement(YearFromValue);







    }



}












