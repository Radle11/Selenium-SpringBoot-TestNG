package springBootSelenium.test;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;
import springBootSelenium.page.facebook.FacebookLogInPage;
import springBootSelenium.page.yahoo.YahooSearchPage;
import springBootSelenium.utils.AbstractTest;


public class FaceBookLogInPageTest extends AbstractTest{

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    FacebookLogInPage facebookLogInPage;



    @Test
    public void verifyFacebookLogInPage() {

        logger.info("Starting facebook log in page test");
        facebookLogInPage.login("test@test.com","u1xG0MItm9UGNxAcvx4yQy17");
        Assert.assertEquals(facebookLogInPage.errorMessage().getText(),"test");
        logger.info("Facebook login page test completed.");

    }
}
