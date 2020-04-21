package seleniumWithJunit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class simpleTestTest {

    private WebDriver webDriver;
    @Before
    public void runBeforeMethod() throws Exception{
        webDriver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "D:\\junitWithSelenium\\chromedriver.exe");
        System.out.println("加载驱动程序成功");
    }


    @Test
    public void main() {
        webDriver.get("http://cn.bing.com");
        String title = webDriver.getTitle();
        assertEquals("微软 Bing 搜索 - 国内版",title);
        String text = webDriver.findElement(By.className("est_unselected")).getText();
        assertEquals("国际版",text);
        boolean result = webDriver.findElement(By.id("scpl0")).isDisplayed();
        assertEquals(true,result);
        webDriver.quit();
    }
}
