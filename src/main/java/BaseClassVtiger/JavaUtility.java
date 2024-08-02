package BaseClassVtiger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class JavaUtility {
	public static String loginData(String key) throws IOException {
		Properties prop=new Properties();
		FileInputStream file=new FileInputStream(".\\configurefile\\loginfunction.properties");
		prop.load(file);
		String data=prop.getProperty(key);
		return data;

	}
}
