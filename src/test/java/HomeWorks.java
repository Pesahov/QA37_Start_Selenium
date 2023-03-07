import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWorks {
    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd=new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocators(){
        // by tag name
        WebElement el = wd.findElement(By.tagName("button"));
        WebElement element = wd.findElement(By.cssSelector("button"));

        List<WebElement> list = wd.findElements(By.tagName("button"));
        List<WebElement> list1 =wd.findElements(By.cssSelector("button"));

        List<WebElement> list2 = wd.findElements(By.tagName("a"));
        List<WebElement> list3 =wd.findElements(By.cssSelector("a"));

        // by class
        WebElement divcontainer =wd.findElement(By.className("container"));
        WebElement divcontainer1 =wd.findElement(By.cssSelector(".container"));

        List<WebElement> navlist = wd.findElements(By.className("navbar-component_nav__1X_4m"));
        List<WebElement> navlist1 =wd.findElements(By.cssSelector(".navbar-component_nav__1X_4m"));

        // by id
        WebElement nav = wd.findElement(By.id("root"));
        WebElement nav1 = wd.findElement(By.cssSelector("#root"));

        WebElement nav2 = wd.findElement(By.id("goog-gt-"));
        WebElement nav3 = wd.findElement(By.cssSelector("#goog-gt-"));

        // by attribute



        // one of elements find by attribute ==> start & end & contains value
    }
}
