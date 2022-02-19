package com.qa.clodbase;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class mainclass {
	 public static void main( String[] args ){
	System.setProperty("webdriver.gecko.driver","C:\\Users\\dkumargx\\Downloads\\geckodriver\\geckodriver.exe");
   
  
	driver.get("https://www.amazon.com/ap/signin");
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();   
    driver.getTitle();
     System .out.println("");}

}
