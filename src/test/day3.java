package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeSuite
	public void executebeforesuit()
	{
		System.out.println("I will execute before suit test");

	}

	@Test(groups= {"Smoke"})
	public void carloanlogin()
	{
		//selenium code
		System.out.println("car loan login");
		}
	
	@BeforeTest
	public void beforeexecution()
	{
		System.out.println("I will execute First");
	}
	
	@Test(timeOut=4000)
	public void Mobileloanlogin()
	{
		//APPium code
		System.out.println("mobile loan login");
	}
	
	@Test
	public void APIlogin()
	{
		//RestApi code
		System.out.println("API login");
	}
	@BeforeMethod
	public void beforemethodexecution()
	{
		System.out.println("I will execute before every methods/testcase execution ");

	}
	@Test
	public void APIlogin1()
	{
		//RestApi code
		System.out.println("API login1");
	}
	@Test
	public void APIlogin2()
	{
		//RestApi code
		System.out.println("API login2");
	}

}
