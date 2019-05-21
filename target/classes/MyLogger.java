package main.resources;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import sdk.ParametrosConfig;

public class MyLogger {

	public static String returnPath(){
		
		Map<String, String> env = System.getenv();
		String mastercom_config_path = env.get("MASTERCOM_CONFIG");

		File xmlFile = new File(mastercom_config_path);
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder;
		ParametrosConfig parameters = new ParametrosConfig();


		try {
			docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			return 	doc.getElementsByTagName("log").item(0).getTextContent();
		
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}
		
	}
	
	static {
		System.setProperty("log4j.configurationFile",returnPath());
	}
	
	public static Logger getLogger(Class<?> clazz){
		return LogManager.getLogger(clazz);
	}
	
}
