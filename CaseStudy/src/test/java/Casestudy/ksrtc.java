package Casestudy;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



import objectrepository.Booking;
import objectrepository.login;



public class ksrtc {
@Test
public void f() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\bavani.v\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver w;
w = new ChromeDriver();
w.get("https://ksrtc.in/oprs-web/");
w.manage().window().maximize();
login.Signin(w).click();
login.Username(w).sendKeys("bavanis9597@gmail.com");
login.Password(w).sendKeys("12@bav.V");
login.Login(w).click();

Booking.startingpt(w).sendKeys("BAN");
Thread.sleep(3000);
List<WebElement> ele1 = w.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
for(WebElement list:ele1) {
if(list.getText().equals("BANGALORE")) {
list.click();
break;
}}

Booking.endingpt(w).sendKeys("MUM");
Thread.sleep(3000);
List<WebElement> ele2 = w.findElements(By.xpath("//ul[@id='ui-id-2']/li"));
for(WebElement list:ele2) {
if(list.getText().equals("MUMBAI")) {
list.click();
break;
}}


Booking.journey(w).click();
Thread.sleep(3000);
List<WebElement> allDates=w.findElements(By.xpath("/html/body/div[1]/table/tbody/tr[5]/td[4]/a"));
for(WebElement ele3:allDates)
{





String date=ele3.getText();
if(date.equalsIgnoreCase("29"))
{
ele3.click();
break;
}
}
Booking.returnjourney(w).click();
Thread.sleep(3000);
List<WebElement> allDates1=w.findElements(By.xpath("/html/body/div[1]/table/tbody/tr[5]/td[6]/a"));
for(WebElement ele4:allDates1)
{





String date=ele4.getText();
if(date.equalsIgnoreCase("31"))
{
ele4.click();
break;
}
}
Thread.sleep(5000);
Booking.search(w).click();

}
}