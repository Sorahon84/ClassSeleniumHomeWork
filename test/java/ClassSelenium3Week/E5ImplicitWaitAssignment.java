package ClassSelenium3Week;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class E5ImplicitWaitAssignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/synchronization-waits-homework.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement synchronizationWaits3 = driver.findElement(By.xpath("//button[@id='show_text_synchronize_three']"));
        synchronizationWaits3.click();
        WebElement optionButton = driver.findElement(By.xpath("//input[@value='Option-1']"));
        optionButton.click();
    }
}
