package seleniumWithJunit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class simpleTest {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\junitWithSelenium\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://cn.bing.com");
        String title = webDriver.getTitle();
        System.out.println("Home page Title"+ title);
        WebElement element = webDriver.findElement(By.className("est_unselected"));
        String text = element.getText();
        System.out.println("choose search type" + text);
        webDriver.quit();
    }
}
