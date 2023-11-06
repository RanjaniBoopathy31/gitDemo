package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day2 {

@Test(groups= {"Smoke"})
public void demo()
{
System.out.println("BBYE");	
}

@AfterSuite
public void aftersuit()
{
	System.out.println("I will execute after suit(means once all the testcases are executed");

}
@Test(dataProvider = "getData")
public void login(String username,String pwd)
{
	System.out.println("data provider login check");
	System.out.println(username);
	System.out.println(pwd);

	}

@DataProvider
public void getData()
{
	// data provider is nothing but we can get the multiple datas and pass the method as an argument to that particular test case(ex: login method)
	// we can get it through parameter also but in parameter we can get single dimension only to get multiple data sets we can use data provider
	//here to get the data we are using multidimensional array
	// for login we have 3 combinations to get the data
	// combination 1 = get username and pwd for good credit history customers
	// cmb 2 = get username and pwd for no credit history
	// cmb 3 = get username and pwd for -fraudlent credit history
	// so,we are 3 sets here , row contains 3 combinations and column contains 2(username and pwd)
	
	object[][] data = new object[3][2];   // 3 for row and 2 for column
	//set 1
	data[0][0]="username1";
	data[0][1]="pwd1";
	
	//set2
	data[1][0]="username2";
	data[1][1]="pwd2";
	
	//set3
	data[2][0]="username3";
	data[2][1]="pwd";
	
	return data;
}
}
