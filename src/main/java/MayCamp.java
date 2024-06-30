import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MayCamp {

    static WebDriver driver = new EdgeDriver();

    public static void main(String[] args) throws InterruptedException {
        configBrowser();
        navigateGoogle("https://duckduckgo.com/");

        //URL
        String URL = getAmazonUrl();
        System.out.println("Your URL: "+ URL);

        //Title
        String amazonPageTitle = getPageTitle();
        System.out.println("Your Page Title is: " + amazonPageTitle);

        //Page Source
        String amazonPageSource = getAmazonPageSource();
        System.out.println("Your Page Source is: " + amazonPageSource);

        //Search
        search("Nezam");

        //calling
    }

    //definition
    static void navigateGoogle(String URL) throws InterruptedException {
        driver.navigate().to(URL);
        Thread.sleep(1500);
    }

    static void configBrowser(){
        driver.manage().window().maximize();
    }

    static String getAmazonUrl(){
        return driver.getCurrentUrl();
    }

    static String getPageTitle(){
        return driver.getTitle();
    }

    static String getAmazonPageSource(){
        return driver.getPageSource();
    }

    static void search(String companyName){
        driver.findElement(By.id("searchbox_input")).sendKeys(companyName);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

}
