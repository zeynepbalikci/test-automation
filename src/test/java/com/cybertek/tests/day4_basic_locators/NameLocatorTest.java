package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {

  public static void main(String[] args) {

    // open browser
    WebDriver driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();

    // navigate to website
    driver.get("http://practice.cybertekschool.com/sign_up");

    // enter full name
    WebElement fullnameInput = driver.findElement(By.name("full_name"));
    fullnameInput.sendKeys("Mike Smith");

    // enter email
    WebElement emailInput = driver.findElement(By.name("email"));
    emailInput.sendKeys("mikesmith@cybertekschool.com");

    // clicking sing up button
    WebElement singUp = driver.findElement(By.name("wooden_spoon"));
    singUp.click();

    // task
    String expectedText = "Thank you for signing up. Click the button below to return to the home page.";

    WebElement messageElement = driver.findElement(By.name("signup_message"));

    String actualMessage = messageElement.getText();

    if (actualMessage.equals(expectedText)){
      System.out.println("PASS");
    }else{
      System.out.println("FAIL");
      System.out.println("expectedText : " + expectedText);
      System.out.println("actualMessage : "+ actualMessage);
    }

    WebElement homeInput = driver.findElement(By.id("wooden_spoon"));
    homeInput.click();

    String expectedUrl = "http://practice.cybertekschool.com/";
    String actualUrl = driver.getCurrentUrl();

    if (actualUrl.equals(expectedUrl)){
      System.out.println("PASS");
    }else {
      System.out.println("FAIL");
    }

    driver.quit();

  }
}
