package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class VerifyURLchanged {

  public static void main(String[] args) {

    // open the chrome
    WebDriver driver = WebDriverFactory.getDriver("chrome");

    // go to http://practice.cybertekschool.com/forgot_password links
    driver.get("http://practice.cybertekschool.com/forgot_passwor");




  }

}
