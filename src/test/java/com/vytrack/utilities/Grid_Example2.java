package com.vytrack.utilities;

import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid_Example2 {

    @Test
    public void test1() throws MalformedURLException {

        URL url= new URL("http://localhost:4444/wd/hub");

        DesiredCapabilities desiredCapabilities= new DesiredCapabilities();
        desiredCapabilities.setBrowserName("chrome");
        desiredCapabilities.setPlatform(Platform.LINUX);

        WebDriver driver = new RemoteWebDriver(url, desiredCapabilities);
        driver.get("https://selenium.dev");
    }

    @Test
    public void test2() throws MalformedURLException {

        // OR:

        URL url2= new URL("http://localhost:4444/wd/hub");

        ChromeOptions chromeOptions= new ChromeOptions();


        WebDriver driver2= new RemoteWebDriver(url2, chromeOptions);
        driver2.get("https://selenium.dev");
    }


    public static void main(String[] args) throws MalformedURLException {

        URL url= new URL("http://localhost:4444/wd/hub");

        DesiredCapabilities desiredCapabilities= new DesiredCapabilities();
        desiredCapabilities.setBrowserName("chrome");
        desiredCapabilities.setPlatform(Platform.LINUX);

        WebDriver driver = new RemoteWebDriver(url, desiredCapabilities);
        driver.get("https://selenium.dev");
        System.out.println("driver1: "+driver.getTitle());


        // OR:

        URL url2= new URL("http://localhost:4444/wd/hub");

        ChromeOptions chromeOptions= new ChromeOptions();


        WebDriver driver2= new RemoteWebDriver(url2, chromeOptions);
        driver2.get("https://selenium.dev");
        System.out.println("driver2: "+driver2.getTitle());




    }
}
