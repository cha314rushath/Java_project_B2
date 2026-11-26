package Selenium_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Day3_ {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile", Keys.ENTER);
//        h2[aria-label*='Samsung']
        driver.findElements(By.cssSelector("h2[aria-label*='Samsung']")).get(0).click();
    }
}
// id  :--> if we have id attribute
// name  :--> if have name attribute
// link/p :--> only links
// class :--> class attribute
// tag_name  :--> tag_name

/*
    css :--> any attribute
    id,class,name,type,......
    tag_name[an='av']





 */