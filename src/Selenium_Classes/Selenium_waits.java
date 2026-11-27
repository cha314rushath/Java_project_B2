package Selenium_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Selenium_waits {
    static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("https://codepen.io/Diwakar-Blogging/pen/bGZeJLg");
        driver.switchTo().frame("CodePen");

        driver.findElement(By.id("resendBtn")).click();
//        System.out.println(driver.findElement(By.id("timer")).getText());
        //web ele :--condition 61sec condtion
        //Exp :--> checking the condition
        // then it move to next line / timeoutexp

//        WebElement ele = driver.findElement(By.id("resendBtn"));
//        //1.WebDriverWait object
//        //2.pass webdriver,duration as argu
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(61));
//        //3.utill method (cond)
//        wait.until(d->ele.isEnabled());
//        ele.click();
//        System.out.println("done");

        Wait<WebDriver> wait1 =
                new FluentWait<>(driver)
                        .withTimeout(Duration.ofSeconds(125))//
                        .pollingEvery(Duration.ofSeconds(61))//122
                        .ignoring(NoSuchElementException.class);//
        WebElement ele1 = driver.findElement(By.id("resendBtn"));
        wait1.until(d->ele1.isEnabled());
        ele1.click();
        /*
        100D
        10D :--test
        20D:-->
        ...
        100D:--> Exp
         */


        /*
        125:-->
        61:-->check stop
        122 :-->
        125 :-->time out exp



         */



//        map(n->n*2)
//      61





        //        driver.get("https://www.moneycontrol.com/");
//        driver.findElement(By.id("search_str")).sendKeys("abc");
//50000 mil
        //10sec
    }
}
