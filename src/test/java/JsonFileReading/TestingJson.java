package JsonFileReading;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestingJson {

	public static void main(String[] args) throws IOException {
		
		System.out.println(generateStringFromResource("C:\\d data\\Automation\\RestAssured"));
	;
		
			
	 
		}
	 
		
		public static String generateStringFromResource(String path) throws IOException{
			
			return new String(Files.readAllBytes(Paths.get(path)));
			
		}
}
