package FirstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Firsttesting {

    @Test
    public void valid() {

        WebDriver driver=new ChromeDriver();

        driver.get("https://google.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

        System.out.println("Welcome Rafi");


    }
}
