package newpack;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\harda\\Desktop\\Coding_and_Projects\\chromedriver.exe"); //setting the driver executable
        WebDriver driver=new ChromeDriver(); //Initiating your chromedriver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Applied wait time
        driver.manage().window().maximize(); //maximize window
        driver.get("http://localhost:8080/demo10_war_exploded/"); //open browser with desried URL
        WebElement a = driver.findElement(By.id("10"));
        String b = a.getText();
        driver.close(); //closing the browser
        System.out.println(b);
    }
}