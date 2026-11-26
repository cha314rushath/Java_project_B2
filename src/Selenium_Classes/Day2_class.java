package Selenium_Classes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class Day2_class {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        List<WebElement> links =  driver.findElements(By.tagName("img"));//[]
        //[login,reg,addtocart.............]
        System.out.println(links.size());
        // list of web
        // [link1,link2,link3..............]
        for(WebElement i : links){//[link1,link2]
            System.out.println(i.getText() +" = "+ i.getAttribute("src"));
        }

//        driver.findElement(By.partialLinkText("Books")).click();
        // how many links:  a
        // how many img ;; img
        // how table  :-- table
        // how mnay rows :-- >tr
        // how many col:-- td
        // how many headinh :-- th
        // how many list :-- ol /ul
        // how many list op :-- li

        //class_name and Tag_name
//        driver.findElement(By.linkText("Log in")).click();
//        driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
//        driver.findElement(By.name("Password")).sendKeys("abc@123");


        // only links :--> ?
        // any web ele starts with <a

    }
}
