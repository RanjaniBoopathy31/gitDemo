package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class day1 {

	@BeforeClass
	public void beforeclassexec()
	{
		System.out.println("i will execute before class");
		System.out.println("i will execute before class1");
		System.out.println("i will execute before class2");


	}
@Test(groups= {"Smoke"})
public void demo()
{
	System.out.println("Hello");
}

@Test
public void demo1()
{
	System.out.println("Bye");
}

@AfterClass
public void afterclassexec()
{
	System.out.println("i will execute after class(means,after exection of methods ");
}
}
