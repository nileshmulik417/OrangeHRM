package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {
	
	public static String getConfigData(String data) throws IOException {
		Properties prop = new Properties();
		
		String path = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";
		
		FileInputStream fis= new FileInputStream(path);
		
		prop.load(fis);
		
		return prop.getProperty(data);
		
	}

}
