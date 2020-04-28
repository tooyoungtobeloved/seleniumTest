package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageFactory {

    //    用户名输入框
    @FindBy(xpath = "//table//td//input[@id='uid']")
    private WebElement userNameInput;
    //    密码输入框
    @FindBy(xpath = "//table//td//input[@id='passw']")
    private WebElement userPwdInput;
    //    登录按钮
    @FindBy(id = "login")
    private WebElement login;
    //    整个页面
    private WebElement html;

    private String testURL = "http://www.testfire.net/bank/login.jsp";

    private WebDriver driver;

    public WebElement getHtml() {
        return html;
    }

    public void init() {
        //构造函数，生成浏览器对象，初始化PageFactory对象
        System.setProperty("webdriver.chrome.driver", "D:\\junitWithSelenium\\chromedriver.exe");
        driver = new ChromeDriver();
        PageFactory.initElements(driver, this);
        System.out.println("pagefactory init success");

    }

    public WebElement getUserNameInput() {
        return userNameInput;
    }

    public WebElement getUserPwdInput() {
        return userPwdInput;
    }

    public void open() {
        //打开登录页面
        driver.get(testURL);
    }

    public void login() {
//        String winHandleBefore = driver.getWindowHandle();
//        for (String winHandle : driver.getWindowHandles()) {
//            if (winHandle.equals(winHandleBefore)) {
//                continue;
//            }
//            driver.switchTo().window(winHandle);
//            break;
//        }
//        login.submit();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        login.submit();
    }

    public void quit() {
        //结束driver
        driver.quit();
    }

    public void getTotalPageInfo() {

        this.html = driver.findElement(By.tagName("html"));

    }

    public void loginPage() {
        userNameInput.sendKeys("admin");
        userPwdInput.sendKeys("admin");
    }

}
