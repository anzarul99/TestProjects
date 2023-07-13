package com.shankar.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;

import org.json.simple.parser.JSONParser;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.jayway.jsonpath.JsonPath;

public class ShFileUtils {
	
	public static InputStream readPropertiesFile(String filePath) {
		InputStream inputStream = null;
		
		try {
			ClassLoader classLodar= Thread.currentThread().getContextClassLoader();
			inputStream = classLodar.getResourceAsStream(filePath);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return inputStream;
		
		
	}
	
	public static String readLocatore(String inputFile, String key) {
		String value = null;
		
		try {
			Properties prop= new Properties();
			prop.load(readPropertiesFile("data/Locators/"+inputFile+".properties"));
			value = prop.getProperty(key);		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return value;
		
	}
	
	public static String readJsonFile(String fileName) throws Exception {
		Object JsonObject = null;

		JSONParser jsonParser = new JSONParser();
		String file = "src/test/resources/data/testdata/"+fileName;
		FileReader fileReader= new FileReader(file);
		JsonObject = jsonParser.parse(fileReader);
	
		return JsonObject.toString();
	}
	public static boolean isValidJson(String inputJsonFile) {
		Gson gson = new Gson();
		try {
			gson.fromJson(inputJsonFile, Object.class);
		}
		catch(JsonSyntaxException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public static String readJsonData(String inputJson, String key) {
		String value= null;
		try {
			Object jsonObject = null;
			JSONParser parser = new JSONParser();
			jsonObject = parser.parse(inputJson);
			value= JsonPath.read(jsonObject, key);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return value;
	}

}
