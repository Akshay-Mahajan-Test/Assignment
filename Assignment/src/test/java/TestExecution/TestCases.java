package TestExecution;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Basic.TestBase;
import POM.Pom;


public class TestCases extends TestBase{
	WebElement element;
	
	//Test Case :1
	@Test// Valid Login
	public void ValidCrendentials()
	{
		Pom pom= new Pom(driver);
		pom.ClickonUsername("Valid UserName");
		pom.ClickonPassword("Valid PassWord");
		pom.ClickonLogin();
	}
	
	//Test Case :2
	@Test // Invalid Login
	public void InvalidCrendentials()
	{
		Pom pom= new Pom(driver);
		pom.ClickonUsername("Invalid UserName");
		pom.ClickonPassword("Invalid PassWord");
		pom.ClickonLogin();
		String exp = "Please enter a valid Username or Password.";
	    //identify actual error message
	    WebElement m = driver.findElement(By.className("alert-content"));
	    String act = m.getText();
	    System.out.println("Error message is: "+ act);
	    //verify error message with Assertion
	    Assert.assertEquals(exp, act);
	}
	
	//Test Case: 3
	@Test
	public void retainLogin_Page()
	{
		Pom pom= new Pom(driver);
		pom.ClickonUsername("Valid UserName");
		pom.ClickonPassword("Valid PassWord");
		pom.ClickonLogin();
		System.out.println(driver.getTitle());
		
	}
	
	
	//Test Case:4
	@Test
	public void DisableLoginButton()
	{
		Pom pom= new Pom(driver);
		pom.ButtonEnabled();
	}
	
	
	//Test Case :5
	@Test
	public void ButtonEnabled()
	{
		Pom pom= new Pom(driver);
		pom.ClickonUsername("Valid UserName");
		pom.ClickonPassword("Valid PassWord");
		pom.ButtonEnabled();
	}
	
	//Test Case: 6
	@Test
	public void ForgotLink()
	{
		Pom pom= new Pom(driver);
		pom.ClickonForgotLink();
		String Actual= driver.getTitle();
		assertEquals(Actual, "Forgot Recovery");
	}
	
	//Test Case: 7
	@Test
	public void ResetPass()
	{
		Pom pom= new Pom(driver);
		pom.ClickonForgotLink();
		pom.ClickonEmail("Valid Email");
		pom.ClickonRecoverButton();
		pom.ClickonReset("Provide New Password");
		pom.ClickonUsername("Valid UserName");
		pom.ClickonPassword("Valid PassWord");
		pom.ClickonLogin();
	}
	
	//Test Case: 8
	@Test
	public void PaginationLoad() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		element.click();
		Thread.sleep(10000);
	}
	
	//Test Case: 9
	@Test
	public void StrenthPassword()
	{
		int n = 0;
        boolean hasLower = false, hasUpper = false,
                hasDigit = false, specialChar = false;
		System.out.print("Strength of password:- ");
        if (hasDigit && hasLower && hasUpper && specialChar
            && (n >= 8))
            System.out.print(" Strong");
        else if ((hasLower || hasUpper || specialChar)
                 && (n >= 6))
            System.out.print(" Moderate");
        else
            System.out.print(" Weak");
        Pom pom= new Pom(driver);
		pom.ClickonUsername("Invalid UserName");
		pom.ClickonPassword("Invalid PassWord");
		pom.ClickonLogin();
        String exp = "Please enter a valid Username or Password.";
	    //identify actual error message
	    WebElement m = driver.findElement(By.className("alert-content"));
	    String act = m.getText();
	    System.out.println("Error message is: "+ act);
	    //verify error message with Assertion
	    Assert.assertEquals(exp, act);
	}
	}

