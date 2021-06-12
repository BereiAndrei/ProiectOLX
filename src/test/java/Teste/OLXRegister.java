package Teste;

import Base.BaseOLX;
import Help.ElementMethods;
import PropertyUtility.PropertyFile;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class OLXRegister extends BaseOLX {
        ElementMethods elementMethods;
        PropertyFile propertyFile;


    @Test
         public void Register(){
        elementMethods=new ElementMethods(driver);
        propertyFile=new PropertyFile("RegisterData");


        WebElement Cokies= driver.findElement(By.id("onetrust-accept-btn-handler"));
        elementMethods.ClickElement(Cokies);

        WebElement WebAccount= driver.findElement(By.id("topLoginLink"));
        elementMethods.ClickElement(WebAccount);

        WebElement CreateNewAccount=driver.findElement(By.id("register_tab"));
        elementMethods.ClickElement(CreateNewAccount);

        WebElement WebMail=driver.findElement(By.xpath("//input[@id='userEmailRegister']"));
        String MailValue=propertyFile.GetPropertyValue("Email");
        elementMethods.FillElement(WebMail,MailValue);

        WebElement WebPassword=driver.findElement(By.xpath("//input[@id='userPassRegister']"));
        String PasswordValue=propertyFile.GetPropertyValue("Parola");
        elementMethods.FillElement(WebPassword,PasswordValue);

        WebElement CheckBox= driver.findElement(By.xpath("//div[@class='login-form__checkbox']/label[1]"));
        elementMethods.ClickElement(CheckBox);

//        WebElement Inregistrare= driver.findElement(By.id("button_register"));
//        elementMethods.ClickElement(Inregistrare);


    }


}
