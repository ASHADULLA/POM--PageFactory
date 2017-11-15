package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
public WebDriver driver;

@FindBy(name="password")
public WebElement pwd;
@FindBy(xpath="(//*[contains(text(),'Enter a password' or contains(text(),'Wrong password')])[2]") //Dom for error msg
public WebElement pwderr;

public Loginpage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void fillpwd(String p)
{
	pwd.sendKeys(p,Keys.ENTER);
}
}
