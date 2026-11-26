package Selenium_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_css_xpath {


    static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/login");
        WebElement email_id = driver.findElement(By.id("Email"));
        if (email_id.isEnabled()) {
            email_id.clear();
            email_id.sendKeys("abc@gmail.com");
        }
        WebElement pwd = driver.findElement(By.id("Password"));
        if(pwd.isEnabled()){
            pwd.clear();
            pwd.sendKeys("abc@123");
        }
        WebElement login_button = driver.findElement(By.cssSelector("input[value='Log in']"));
        if(login_button.isEnabled()){
            login_button.click();
        }
        try {
            WebElement error_msg = driver.findElement(By.cssSelector("div[class='validation-summary-errors']"));
            if (error_msg.isDisplayed()) {
                System.out.println(error_msg.getText());
            }
        }
        catch (Exception e){
            System.out.println("No error msg");
        }

        try{
           WebElement logout = driver.findElement(By.linkText("Log out"));
           if(logout.isDisplayed()){
               System.out.println("user login");
           }
        }
        catch (Exception e){
            System.out.println("user not login");
        }
    }
}

/*
    if have id
    if have class
    if we have any attribute we can go css

    if we have id :--> then we can use (#id)
    if we have class :--> then we can use (.class)
    tag_name[@an='av']
 */
/*
   //tag_name[@an='av']
   //tag_name[text()='text']
   //tag_name[contains(@an,'av')]
   //tag_name[contains(text(),text)]
   //(xpath)[index]
   
 */