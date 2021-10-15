package springBootSelenium.utils;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import springBootSelenium.SpringBootSeleniumApplication;

@SpringBootTest(classes = SpringBootSeleniumApplication.class)
public class AbstractTest extends AbstractTestNGSpringContextTests{
    Logger logger = LoggerFactory.getLogger(this.getClass());
    WebDriver driver=Driver.getDriver();

    @Parameters({"url"})
    @BeforeClass
    public void tearUp(String url){
       driver.navigate().to(ConfigReader.getProperty(url));
        logger.info("Launch facebook login page " + Thread.currentThread().getId());
    }
    @AfterClass
    public void close(){
        logger.info("After Method :: Trying to close all web driver instances");
        driver.quit();
    }
}
