package objectrepository;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;public class login {
public static WebElement Signin(WebDriver driver) {
return driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/div/ul[1]/li[1]/a"));
}
public static WebElement Username(WebDriver driver) {
return driver.findElement(By.name("userName"));
}
public static WebElement Password(WebDriver driver) {
return driver.findElement(By.name("password"));
}
public static WebElement Login(WebDriver driver) {
return driver.findElement(By.name("submitBtn"));
}}

