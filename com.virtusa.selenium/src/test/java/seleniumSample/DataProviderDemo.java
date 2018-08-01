package seleniumSample;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
//sample program for dataprovider demo
	@DataProvider
	public Object[][] provideData(){
		Object a[][]=new Object[2][2];
		a[0][0]="sharmi";
		a[0][1]=30;
		a[1][0]="Raghu";
		a[1][1]=5;
		return a;
			}
	
	//based on row of rows in dataprovider that many times test method will execute
	@Test(dataProvider="provideData")
	public void getData(String name,int dob){
		Reporter.log(name+" birth date is "+dob,true);
	}
}
