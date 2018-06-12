import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.IndexPage;

public abstract class MainTest {
    protected WebDriver driver;
    protected IndexPage indexPage;


    @BeforeMethod
    @Parameters({"url"})
    public void before(String url) {
        driver = new ChromeDriver();
        indexPage = new IndexPage(driver,url);



    }
    @AfterMethod
    public void after(){
       driver.close();

    }

   }

