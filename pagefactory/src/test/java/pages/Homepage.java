package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
public WebDriver driver;
@FindBy(name="identifier")//Dom for userid
public WebElement uid;
@FindBy(xpath="(//*[contains(text(),'Enter an email') or contains(text(),'Sorry, Google')])[1]") //Dom for error msg
public WebElement uiderr;

public Homepage(WebDriver driver)
{
this.driver=driver;	
PageFactory.initElements(driver, this);
}
public void filluid(String u)
{
	uid.sendKeys(u,Keys.ENTER);
}
}
