package spting.settings.browsers;

import org.openqa.selenium.WebDriver;
import spting.factory.WebDriverFactory;

public class WindowSize {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.create("chrome");

        System.out.println(driver.manage().window().getSize());

        driver.manage().window().maximize();

        System.out.println(driver.manage().window().getSize());

        driver.quit();
    }
}