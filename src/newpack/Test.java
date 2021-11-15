package newpack;

import java.time.Duration;
import org.junit.jupiter.api.Assertions;
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
        driver.get("https://www.n11.com/"); //open browser with desired URL
        WebElement input = driver.findElement(By.id("searchData"));
        input.sendKeys("Bilgisayar");
        //Thread.sleep(4000);
        WebElement search = driver.findElement(By.className("searchBtn"));
        search.click();
        //Thread.sleep(4000);
        WebElement search_result = driver.findElement(By.className("resultText"));
        boolean res = search_result.getText().contains("Bilgisayar");
        //Thread.sleep(4000);
        String result = "Arama Başarısız.";
        if(res) result = "Arama Başarılı.";
        System.out.println(result);
        driver.close(); //closing the browser
    }
}