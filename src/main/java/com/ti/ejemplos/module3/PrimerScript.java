package com.ti.ejemplos.module3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimerScript {
    static WebDriver driver;
    static String url = "https://demosite.titaniuminstitute.com.mx/wp-admin/admin.php?page=sch-dashboard";
    static String actualResult = "";
    static String expectedResult = "TI Demo Site";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver");

        //Open browser

        driver = new ChromeDriver();

        //Navigate to the URL

        driver.get(url);

        actualResult = driver.getTitle();

        System.out.println(actualResult.contains(expectedResult)? "El resultado esperado coincide con el resultado obtenido: " + actualResult : "El resultado esperado no coincide con el resultado obtenido: " + actualResult);


        driver.quit();

    }
}