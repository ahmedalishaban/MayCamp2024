import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class MayCamp {

    static WebDriver driver = new EdgeDriver();

    public static void main(String[] args) throws InterruptedException {
        configBrowser();
        navigateURL("https://the-internet.herokuapp.com/login");

        System.out.println(getUsernameText().getText());

        String subHeader = getSubHeader().getText();
        System.out.println(subHeader);

        getUsernameField().sendKeys("tomsmith");
        getPasswordField().sendKeys("SuperSecretPassword!");
        getLoginBtn().click();



//        navigateURL("https://the-internet.herokuapp.com/checkboxes");
//        getDropDownPage().click();
//        Thread.sleep(1500);
//        getDropDownBox().selectByIndex(1);
//        Thread.sleep(1500);
//        getDropDownBox().selectByValue("2");
//        Thread.sleep(1500);
//        getDropDownBox().selectByVisibleText("Option 1");
//        getCheckBox1().click();
//        Thread.sleep(1500);
//        getCheckBox2().click();





        //calling
    }

    //definition
    static void navigateURL(String URL) throws InterruptedException {
        driver.navigate().to(URL);
        Thread.sleep(1500);
    }

    static void configBrowser(){
        driver.manage().window().maximize();
    }

    static WebElement getUsernameField(){
        return driver.findElement(By.xpath("//input[@type='text']"));
    }

    static WebElement getPasswordField(){
        return driver.findElement(By.name("password"));
    }

    static WebElement getSubHeader(){
        return driver.findElement(By.cssSelector(".subheader"));
    }

    static WebElement getDropDownPage(){
        return driver.findElement(By.linkText("Dropdown"));
    }

    static WebElement getLoginPage(){
        return driver.findElement(By.partialLinkText("Form"));
    }

    static WebElement getUsernameText(){
        return driver.findElement(By.xpath("//label[@for='username']"));
    }

    static Select getDropDownBox(){
        Select selectOption = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        return selectOption;
    }

    static WebElement getCheckBox1(){
        return driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
    }

    static WebElement getCheckBox2(){
        return driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
    }

    static WebElement getLoginBtn(){
        return driver.findElement(By.className("radius"));
    }

}
