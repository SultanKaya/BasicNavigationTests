package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

import static com.cbt.utilities.StringUtility.verifyEquals;

public class NavigationTests {

    public static void main (String [] args){
        navigationTest("chrome");
        navigationTest("firefox");
        navigationTest("safari");
    }

    public static void navigationTest (String browser) {
        String url1 = "https://google.com";
        String url2 = "https://etsy.com";
        System.out.println("Your browser "+ browser);

        //1. open browser
        WebDriver myDriver = BrowserFactory.getDriver(browser);

        //2. go to website https://google.com
        myDriver.get(url1);

        //3. save the title in a string variable
        String title_1 = myDriver.getTitle();

        //4.go to https://etsy.com
        myDriver.get(url2);

        //5. save the title in a string variable
        String title_2 = myDriver.getTitle();

        //6.navigate back to previous page
        myDriver.navigate().back();

        /*
        GOOGLE   title ----->ETSY title ----< GOOGLE driver.getTitle() ----> ETSY getTitle()
         */

        //7.verify that title is same in step3
        verifyEquals(title_1, myDriver.getTitle());   // expected result PASS

        //8. navigate forward to previous page
      myDriver.navigate().forward();

      //9. verify that title is same in step5
        verifyEquals(title_2,myDriver.getTitle());

         myDriver.close();
    }

    }
