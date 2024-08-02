package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StoreData {
	@DataProvider(name="data")
	public Object[][]sender(){
		Object[][]obj=new Object[2][2];
		obj[0][0]="sweety";
		obj[0][1]="rutuja";
		obj[1][0]="shital";
		obj[1][1]="aishwarya";
		return obj;
		
	}
	
	@Test(dataProvider = "data")
	public void receiver(String data1,String data2) {
		System.out.println(data1);
		System.out.println(data2);
	}

}
