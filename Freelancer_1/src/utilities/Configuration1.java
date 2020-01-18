package utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Configuration1 {

	public static String applicationConfig(String keyname ) throws IOException {
		File f=new File("./ConfigFiles/ProjectConfig.properties");
		FileReader fr=new FileReader(f);
		Properties prop=new Properties();
		prop.load(fr);
	    return	prop.getProperty(keyname);
			}
	
	public static String elementConfig(String keyname ) throws IOException {
		File f=new File("./ConfigFiles/ElementLocator.properties");
		FileReader fr=new FileReader(f);
		Properties prop=new Properties();
		prop.load(fr);
	    return	prop.getProperty(keyname);
			}

}