package utils;

import java.util.Properties;
import java.io.InputStream;
import java.io.FileInputStream;

public class Utils {

	public static String readProperty(String key) {

		String value="";
		try (InputStream input = new FileInputStream("./src/test/resources/data/configuration.properties")) {
			Properties prop = new Properties();
			prop.load(input);
			value = prop.getProperty(key);
		} catch (Exception e) {}
		return value;
	}
}