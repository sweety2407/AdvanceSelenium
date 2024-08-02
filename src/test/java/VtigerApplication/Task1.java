package VtigerApplication;

import java.io.IOException;

import org.testng.annotations.Test;

import BaseClassVtiger.BaseClass;
import pom.Vtiger;

public class Task1 extends  BaseClass {
	@Test
	public void createOrganisation() throws IOException {
		BaseClass ref=new BaseClass();
		ref.preCondition();
		ref.login();
	Vtiger ref1=new Vtiger(driver);
	ref1.clickOrganisation();
	ref1.clickCreateOrg();
	ref1.orgName("shriramaptops");
	}


}
