

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;

abstract public class BaseTest {

    public void setUp(){
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.browserSize = "1366x768";
        Configuration.headless = false;
        Configuration.baseUrl ="https://www.google.by/";
    }




    @BeforeEach
    public void init(){
        setUp();
        Selenide.open("");
        sleep(10000);

    }



    @AfterEach
    public void tearDown(){

        Selenide.closeWebDriver();

    }
}
