package PropertyUtility;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

    public FileInputStream File;
    public Properties Property;

    public PropertyFile(String Email) {
        LoadFile(Email);
    }


    public void LoadFile(String Email) {
        Property = new Properties();
        try {
            File = new FileInputStream("src/test/resources/InputData/" + Email + ".properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Property.load(File);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String GetPropertyValue(String Key) {
        return Property.getProperty(Key);

    }
}
