package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Booking {
public static WebElement startingpt(WebDriver driver) {
return driver.findElement(By.id("fromPlaceName"));
}

public static WebElement endingpt(WebDriver driver) {
return driver.findElement(By.id("toPlaceName"));
}

public static WebElement journey(WebDriver driver) {
return driver.findElement(By.id("txtJourneyDate"));
}

public static WebElement returnjourney(WebDriver driver) {
return driver.findElement(By.id("txtReturnJourneyDate"));
}

public static WebElement search(WebDriver driver) {
return driver.findElement(By.xpath("/html/body/main/form/div[1]/div/div[2]/div[3]/button"));
}



}