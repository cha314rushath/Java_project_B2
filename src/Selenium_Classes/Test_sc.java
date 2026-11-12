package Selenium_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Test_sc {
    static void main(String[] args) {
        String url = "https://mail.google.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().minimize();
        driver.get(url);

        String curl = driver.getCurrentUrl();
        if(url.equals(curl)){
            System.out.println("testpass");
        }
        else{
            System.out.println("testFail");
            System.out.println("url is mismatching exp" +url + "acu url is" + curl);
        }
 // 11,12,13 Imp
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.flipkart.com/");
//        System.out.println("url of the page = " + driver.getCurrentUrl());
//        System.out.println("title of the page is " + driver.getTitle());
////        driver.get("https://www.facebook.com/");
//        driver.navigate().to("https://www.facebook.com/");
//        System.out.println("url of the page = " + driver.getCurrentUrl());
//        System.out.println("title of the page is " + driver.getTitle());
//
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();
//        driver.manage().window().minimize();
//        driver.quit();


        /*
        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/cart");
        driver.manage().window().maximize();
        String url = driver.getCurrentUrl() ;
        System.out.println(url);
        String title = driver.getTitle();
        System.out.println(title);
*/

    }
}
