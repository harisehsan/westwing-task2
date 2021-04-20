package base;


import base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends BaseUtil {

    private BaseUtil base;

    public Hooks(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest(){
        System.out.println("opening browser");
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        base.driver = new ChromeDriver();
        base.driver.manage().window().maximize();
    }

    @After
    public void TearDownTest(Scenario scenario){

        if (scenario.isFailed()){
            //Take screenshot
            System.out.println(scenario.getName());
        }
        base.driver.close();
        base.driver.quit();
    }
}

