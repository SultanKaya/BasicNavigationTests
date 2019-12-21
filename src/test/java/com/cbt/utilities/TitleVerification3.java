package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class  TitleVerification3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver() .setup();
        ChromeDriver driver= new ChromeDriver();

        List<String> urls = Arrays.asList("https://www.luluandgeorgia.com/",
                "https://www.wayfair.com/",
                "https://www.walmart.com/",
                "https://www.westelm.com/");

for (int i=0 ; i< urls.size() ; i++){
   driver.get(urls.get(i)) ;

   String title= driver.getTitle().toLowerCase().replaceAll(" ","");
   int firstIndex= urls.get(i).indexOf("www.");
   int lasIndex= urls.get(i).indexOf(".com");
   String domain=urls.get(i).substring(firstIndex+4,lasIndex);

   if (title.contains(domain)) {
       System.out.println(urls.get(i) + " :PASSED THE TITLE TEST");
   }
   else {
       System.out.println((urls.get(i) + " : Failed THE TITLE TEST"));
   }
   }
   driver.close();
}




    }






