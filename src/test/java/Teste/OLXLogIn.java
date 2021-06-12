package Teste;

import Base.BaseOLX;
import Help.ElementMethods;
import PropertyUtility.PropertyFile;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OLXLogIn extends BaseOLX {
        ElementMethods elementMethods;
        PropertyFile propertyFile;


        @Test
    public void LogIn(){
            elementMethods=new ElementMethods(driver);
            propertyFile=new PropertyFile("RegisterData");

            WebElement Cokies= driver.findElement(By.id("onetrust-accept-btn-handler"));
            elementMethods.ClickElement(Cokies);

            WebElement WebAccount= driver.findElement(By.id("topLoginLink"));
            elementMethods.ClickElement(WebAccount);

            WebElement WebMail=driver.findElement(By.xpath("//input[@id='userEmail']"));
            String MailValue=propertyFile.GetPropertyValue("Email");
            elementMethods.FillElement(WebMail,MailValue);

            WebElement WebPassword=driver.findElement(By.xpath("//input[@id='userPass']"));
            String PasswordValue=propertyFile.GetPropertyValue("ParolaLog");
            elementMethods.FillElement(WebPassword,PasswordValue);

        }


}
