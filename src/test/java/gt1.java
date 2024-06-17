import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;


public class gt1 extends BaseTest {


    private SelenideElement searchArea = $x("//textarea[@title='Поиск']");

    //  private SelenideElement clearNomenclatureTextArea = $x("(//div[@class='wsui-textarea-clear on'])[2]");


    @Test
    public void searchAreaInputTest1()  {

        searchArea.click(); //Установка фокуса на блоке шаблонов, нажатием на первый шаблон "Файл"
        sleep(10000);
        searchArea.setValue("GoogleTest1");
    }





}
