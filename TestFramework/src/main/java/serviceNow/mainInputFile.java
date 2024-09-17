package serviceNow;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class mainInputFile {
	static Properties prop = new Properties();

	
public static Map<String,Object> input() {
	//prop.load(App.class.getClassLoader().getResourceAsStream("input.properties"));
    Map<String,Object> inputProperties = new HashMap<>();

try {
    FileReader reader = new FileReader("C:\\Users\\Admin\\eclipse-workspace\\serviceNow\\src\\test\\resources\\input.properties");
    prop.load(reader);
//    System.out.println("++++++");
//	System.out.println("Browser Value"+ prop.getProperty("browser"));
    
    inputProperties.put("browser", prop.getProperty("browser"));
		
	}catch(Exception e) {
		System.out.println("ERROR++++"+e.getMessage());
	}
return inputProperties;
	

}
	
}
