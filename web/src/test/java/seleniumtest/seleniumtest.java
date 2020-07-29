package seleniumtest;


import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class seleniumtest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    
    
    
    @Test
    public void gNBBest() {
        driver.get("https://chicor.com/main");
        driver.manage().window().setSize(new Dimension(1280, 680));
        driver.findElement(By.linkText("닫기")).click();
        driver.findElement(By.linkText("닫기")).click();
        driver.findElement(By.linkText("BEST")).click();
        driver.findElement(By.linkText("BRANDS")).click();
        driver.findElement(By.linkText("STORY")).click();
        driver.findElement(By.linkText("DEAL")).click();
        {
            WebElement element = driver.findElement(By.linkText("EVENT"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.linkText("EVENT")).click();
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
    }
}

