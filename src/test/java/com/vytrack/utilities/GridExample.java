package com.vytrack.utilities;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridExample {

    public static void main(String[] args) throws MalformedURLException {

// 1.   CREATE URL for the HUB:
//      Create URL Object and provide the IP Address and the Port number where the Grid is running.
//      We use DOCKER to run the Grid, and Docker is installed on our Computer, this is why IP address where the Grid is running is "localhost".

        URL url = new URL("http://localhost:4444/wd/hub"); // "..wd/hub" is standard.


// 2.   SET the Browser:

        ChromeOptions chromeOptions = new ChromeOptions(); // create options


// 3.  CREATE RemoteWebDriver to open Browser remotely using Grid:

        WebDriver driver = new RemoteWebDriver(url, chromeOptions); // RemoteWebDriver--> used to open browser remotely using Grid
        driver.get("https://selenium.dev");

        System.out.println("title: "+driver.getTitle());
        BrowserUtils.wait(3);

        driver.quit();

//           OR: ' DesiredCapabilities'


//  1.  Create URL for the hub:
        URL url2 = new URL("http://localhost:4444/wd/hub");


//  2.  'DesiredCapabilities' :set the Browser and Platform (comes from Selenium):
        DesiredCapabilities desiredCapabilities= new DesiredCapabilities();
        desiredCapabilities.setBrowserName("chrome");
        desiredCapabilities.setPlatform(Platform.LINUX);


//  3.  CREATE RemoteWebDriver to open Browser remotely using Grid
        WebDriver driver2 = new RemoteWebDriver(url2, desiredCapabilities); // RemoteWebDriver--> used to open browser remotely using grid
        driver2.get("https://selenium.dev");

        System.out.println("title: "+driver2.getTitle());
        BrowserUtils.wait(3);
        driver2.quit();


    }
}
