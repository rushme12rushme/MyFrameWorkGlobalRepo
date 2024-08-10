package LoginTest;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ninza.HRM.FileUtility.PropertyFileUtility;
import com.ninza.HRM.POMpages.LoginPage;
import com.ninza.HRM.baseClass.BaseClass;

import javaUtility.JavaUtility;

public class NinzaHRmLoginTest  extends BaseClass{
@Test
public void loginTest() throws IOException
{
	LoginPage lp=new LoginPage(driver);
	PropertyFileUtility pu=new PropertyFileUtility();
	String username=pu.readDataFromConfigFile("userid");
	String password=pu.readDataFromConfigFile("password");
	System.out.println(username);
	System.out.println(password);

	lp.login(username, password);
	String exp="http://49.249.28.218:8091/dashboard/overview";
			WebDriverWait  wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.urlToBe(exp));
			String act=driver.getCurrentUrl();
	
	Assert.assertEquals(act, exp);
}

@Test
public void dateMethodTest()
{
	JavaUtility ju=new JavaUtility();
	String futureDate=ju.add30DaysToDate();
	System.out.println(futureDate);
	
	
}

}
