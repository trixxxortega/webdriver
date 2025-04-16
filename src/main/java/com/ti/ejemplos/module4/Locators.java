package com.ti.ejemplos.module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

        static WebDriver driver;
        static String url = "https://demosite.titaniuminstitute.com.mx/wp-admin/admin.php?page=sch-dashboard";
        static String actualResult = "";
        static String expectedResult = "Titanium School";
        static String user ="admin";
        static String password = "G3-ySzY%";

        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver");



            //Open browser

            driver = new ChromeDriver();

            //Navigate to the URL

            driver.get(url);

            driver.findElement(By.id("user_login")).sendKeys(user);
            driver.findElement(By.name("pwd")).sendKeys(password);
            driver.findElement(By.cssSelector("input#rememberme")).click();
            driver.findElement(By.xpath("//input[contains(@value, 'Log In')]")).click();



            actualResult = driver.findElement(By.className("wpsp-schoolname")).getText();

            System.out.println(actualResult.equals(expectedResult)? "El resultado esperado coincide con el resultado obtenido: " + actualResult : "El resultado esperado no coincide con el resultado obtenido: " + actualResult);


            driver.quit();

        }

}
