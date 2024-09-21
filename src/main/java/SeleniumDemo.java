import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

    public static void main(String[] args){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement(By.id("APjFqb")).click();
    }
}
