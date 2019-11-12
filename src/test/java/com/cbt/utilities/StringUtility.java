package com.cbt.utilities;

public class StringUtility {

    public static void verifyEquals(String expected,String actual){
 System.out.println((expected.equals(actual)?"PASS:":"FAIL")
         + "\nExpected result: " + expected + "\n" + "Actual result: " + actual);
    }

}

