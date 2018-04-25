

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Properties properties = new Properties();
		
		properties.load(new FileInputStream("sample.properties"));

		System.out.println(properties.get("CAN"));
		
	}

}
