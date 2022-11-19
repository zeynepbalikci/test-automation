package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class practice {

  /**
   * open google.com
   * search for airpods
   * click on google search button
   * check if page title contains airpods
   * then go back
   * check page tittle is Google
   * @param args
   */
  public static void main(String[] args) {

    WebDriver driver = WebDriverFactory.getDriver("chrome");

    driver.get("http://amazon.com");

    WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
    search.sendKeys("airpods");

   WebElement button1 = driver.findElement(By.id("nav-search-submit-button"));
   button1.click();

   String title = driver.getTitle();
   System.out.println("title : " + title);

   if (title.contains("airpods")){
     System.out.println("PASS");
   }else {
     System.out.println("FAIL");
   }

   driver.navigate().back();

   String title2 = driver.getTitle();
   System.out.println("title2 : " + title2);

   if (title2.equals("Amazon.com. Spend less. Smile more.")){
     System.out.println("PASS");
   }else {
     System.out.println("FAIL");
   }

   driver.quit();

  }
}
