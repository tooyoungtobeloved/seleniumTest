package config;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class pageFactoryTest {
    private WebDriver webDriver;
    private pageFactory pageFactory;
    @Before
    public void runBeforeMethod() throws Exception{
        pageFactory = new pageFactory();
        pageFactory.init();
        pageFactory.open();
//        给input框添加值
        pageFactory.loginPage();
    }
    @Test
    public void testInputSuccess(){
        Assert.assertEquals(pageFactory.getUserNameInput().getAttribute("value"),"admin");
        Assert.assertEquals(pageFactory.getUserPwdInput().getAttribute("value"),"admin");
    }
    @Test
    public void testContainString(){
        pageFactory.login();
        pageFactory.getTotalPageInfo();
        Assert.assertTrue(pageFactory.getHtml().getText().contains("Congratulations"));
    }
}