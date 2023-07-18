package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	WebDriver driver;
	public Pom(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "username_xpath_xpression") private WebElement Username;
	@FindBy(xpath = "password_xpath_xpression") private WebElement Password;
	@FindBy(xpath = "login_xpath_xpression") private WebElement Login;
	@FindBy(xpath = "forgot_xpath_xpression") private WebElement Forgot_link;
	@FindBy(xpath = "email_xpath_xpression") private WebElement Email;
	@FindBy(xpath = "Reset_xpath_xpression") private WebElement Reset;
	@FindBy(xpath = "recover_button_xpath_xpression") private WebElement RecoverButton;
	
	
	public void ClickonUsername(String User_name)
	{
		Username.click();
		Username.sendKeys(User_name);
	}
	
	public void ClickonPassword(String Pass)
	{
		Password.click();
		Password.sendKeys(Pass);
	}
	
	public void ClickonLogin()
	{
		Login.click();
	}
	
	public void ButtonEnabled()
	{
		System.out.println(Login.isDisplayed());
	}
	
	public void ClickonForgotLink()
	{
		Forgot_link.click();
	}
	
	public void ClickonEmail(String email)
	{
		Email.click();
		Email.sendKeys(email);
	}
	
	public void ClickonReset(String NewPass)
	{
		Reset.click();
		Reset.sendKeys(NewPass);
	}
		
	public void ClickonRecoverButton()
	{
		RecoverButton.click();
	}
	
}