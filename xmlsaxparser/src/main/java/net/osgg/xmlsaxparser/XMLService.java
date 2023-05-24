package net.osgg.xmlsaxparser;

import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class XMLService {

	public void parse() throws Exception{
		String uri = "https://xmlserver.fly.dev/employees";
		
		URL url = new URL(uri);
		HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
		conexion.setRequestMethod("GET");
		conexion.setRequestProperty("Accept", "application/xml");
		
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParcer = factory.newSAXParser();
		CustomHandler handler = new CustomHandler();
		saxParcer.parse(conexion.getInputStream(), handler);
	}
	
}
