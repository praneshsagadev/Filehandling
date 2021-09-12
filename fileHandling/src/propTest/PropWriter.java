package propTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropWriter {

	public static void main(String[] args) throws IOException {
		
File f=new File("D:\\SELENIUM WORKSPACE\\fileHandling\\files\\property1.properties");
		
		FileOutputStream fos=new FileOutputStream(f);
		
		Properties prop= new Properties();
		prop.setProperty("username", "abc@gmail.com");
		prop.setProperty("address", "chennai");
		prop.setProperty("password", "56789");
		//prop.put("broswer", "chrome");
//		prop.store(fos, "writing");
//		fos.close();
		
		
		prop.store(fos, null);
		
		fos.close();
		
		
		
		
		

	}

}
