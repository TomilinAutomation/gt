import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;


public class gt2 extends BaseTest {


    private SelenideElement searchArea = $x("//textarea[@title='Поиск']");
    //



    @Test
    public void searchAreaInputTest2()  {

        searchArea.click();
        sleep(10000);
        searchArea.setValue("GoogleTest2");
    }





}
