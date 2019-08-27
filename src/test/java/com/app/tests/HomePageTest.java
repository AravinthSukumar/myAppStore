package com.app.tests;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.sql.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.pages.BasePage;
import com.app.pages.HomePage;

public class HomePageTest  {
	HomePage hp;
	BasePage bp;
	

	public HomePageTest() {
		hp=new HomePage();
		bp=new BasePage();
	}
@Test
public void verifyWomen() {
	AssertJUnit.assertTrue(hp.getWomen().isDisplayed());
	AssertJUnit.assertTrue(hp.getDresses().isDisplayed());
	AssertJUnit.assertTrue(hp.getShirts().isDisplayed());
}

@Test
public void verifyLinks() {
	System.out.println(hp.WomenLink());
	System.out.println(hp.Dresseslink());
	System.out.println(hp.Shirtslink());

}
@Test
public void subscriptions() {
hp.verifynewsletter();
System.out.println(bp.homename());
hp.Social();
}

@Test
public void displaysizeofdresses() {
AssertJUnit.assertTrue(hp.SizeDisplay().isDisplayed());
System.out.println(hp.SizeDisplay().getText());
AssertJUnit.assertTrue(hp.SizeDisplay1().isDisplayed());
System.out.println(hp.SizeDisplay1().getText());
AssertJUnit.assertTrue(hp.SizeDisplay2().isDisplayed());
System.out.println(hp.SizeDisplay2().getText());
}
}


