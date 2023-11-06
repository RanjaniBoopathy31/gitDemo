
package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	
	@AfterMethod
	public void aftermethodexecution()
	{
		System.out.println("I will execute after, every testcase/methods execution");

	}

	@Test(enabled=false)   // if we give enabled is false den this particular testcase method alone will skip
	public void Homeloanlogin()
	{
		//selenium code
		System.out.println("Home loan login");
		}
	
	@AfterTest
	
	public void afterexecution()
	{
		System.out.println("I will execute last");
	}
	
	@Test
	public void Mobilehomeloanlogin()
	{
		//APPium code
		System.out.println("mobile Home loan login");
	}
	
	@Test(dependsOnMethods= {"Mobilehomeloanlogin"})    // here alphabetical order only all the methods will execute. if we give dependson methods (for a particular method)dat method will execute first
	public void HomeAPIlogin()
	{
		//RestApi code
		System.out.println("Home API login");
	}
	
	@Parameters({"URL","APIusername"})
	@Test
	public void parametermethod(String url,String name)
	{
		System.out.println("parameterization");
		System.out.println(url);
		System.out.println(name);
	}
}
