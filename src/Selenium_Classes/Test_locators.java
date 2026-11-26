package Selenium_Classes;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Test_locators {
    static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.python.org/downloads/");
    String python_v = "Python 3.13.15";
    driver.findElement(By.xpath("//a[text()='"+python_v+"']/../..//span[@class='icon-download']")).click();
         // st ele and Dynamic ele
         //python 3.14   down
         // product_name  add to cart
        //  apple 1kg 100/200/150/400/300
        // wt xpath for static one
//        user_v = "Python 3.13.15"
        // //a[text()='Python 3.13.13']/../..//span[@class='icon-download']


//    16
//    27
//    28

//    driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
//    driver.findElement(By.name("pass")).sendKeys("abc@123");
//    driver.findElement(By.xpath("//span[text()='Log in']")).click();






//    driver.get("https://www.amazon.in/");
//    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books",Keys.ENTER);
//    List<WebElement> check_boxes  =  driver.findElements(By.xpath("//input[@type='checkbox']"));
//        for(WebElement i : check_boxes){
//            i.click();
//        }


//  ElementClickInterceptedException: element click intercepted: Element <input type="checkbox" name="" value="" aria-hidden="true" tabindex="-1"> is not clickable at point (20, 375). Other element would receive the click: <i class="a-icon a-icon-checkbox"></i>
//  (Session info: chrome=158.0.8127.38) (JS)
//   POM :-->
//    driver.get("https://demowebshop.tricentis.com/");
//    List<WebElement> radio_ele = driver.findElements(By.xpath("//input[@type='radio']"));
//    System.out.println(radio_ele); //list [ele,ele2,ele3....]
//    for(WebElement i : radio_ele){
//        i.click();
//    }
//
//    driver.findElement(By.id("vote-poll-1")).click();



//    driver.get("https://www.google.com/");
//    driver.findElement(By.id("ti6dpd")).sendKeys("Books", Keys.ENTER);
//    driver.findElement(By.name("btnK")).click();
//    String aut = driver.getTitle();
//    if(aut.equals("Books - Google Search")){
//        System.out.println("testpass");
//    }
//    else{
//        System.out.println("test Fail");
//    }


//    driver.findElement(By.name("q"));
//    driver.findElement(By.className("gLFyf"));
//    driver.findElement(By.cssSelector("textarea[jsname='yZiJbe']"));
//    driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']"));

    }
}
/*
   //tag_name[@an='av']
   // tag_name[text()='text']
   // tag_name[contains(@an='av')]
   //tag_name[contains(text()='text']
   (xpath)[index]
 */
