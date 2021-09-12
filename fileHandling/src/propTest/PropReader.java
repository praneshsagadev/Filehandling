package propTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropReader {

	
		
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			File f=new File("D:\\SELENIUM WORKSPACE\\fileHandling\\files\\property.properties");
		
			FileInputStream fis= new FileInputStream(f);
			
			Properties prop= new Properties();
			//prop.get("username");
			prop.load(fis);
			
		//	System.out.println("username= " +prop.getProperty("username"));
			
//			
//			Set s= prop.stringPropertyNames();   //Set s= prop.keySet();
//			Iterator it =s.iterator();
//			
//			while(it.hasNext()){
//				String key=it.next().toString();
//				System.out.println(key+": "+prop.get(key));
//				
//				
//			}
//			
			Enumeration e= prop.keys();
			while(e.hasMoreElements()){
				String key=e.nextElement().toString();
				System.out.println(key+": "+prop.get(key));
				
				
			}
			
			
			
	
		
	}
			
			
			

	}


