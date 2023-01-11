package testNG;

import org.testng.annotations.Test;

public class DataProvider {
	/*if u want run same testcase multiple times with multiple data*/
	@Test(dataProvider="data")
	public void test(String state,String capital) {
		System.out.println(state+" : "+capital);
	}
	@org.testng.annotations.DataProvider
	public Object[][] data(){
		Object[][] ar=new Object[3][2];
		ar[0][0]="Delhi";
		ar[1][0]="up";
		ar[2][0]="karnataka";
		
		ar[0][1]="new delhi";
		ar[1][1]="lucknow";
		ar[2][1]="bengaluru";
		
		return ar;
		
	}
	
	

}
