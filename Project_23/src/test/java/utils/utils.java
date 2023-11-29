package utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class utils {
	public static JSONObject loadjsonFile(String FileLocation) {
		JSONParser jsonparser = new JSONParser();
		JSONObject jsonObject = null;
		try {
			Object obj = jsonparser.parse(new FileReader(FileLocation));
			jsonObject = (JSONObject) obj;
			}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return jsonObject;
		}

}
