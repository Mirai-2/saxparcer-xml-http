package net.osgg.xmlsaxparser;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class CustomHandler extends DefaultHandler {
	boolean id = false;
    boolean firstName= false;
    boolean lastName = false;
    boolean emailId = false;

    
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        //System.out.println("(starts element:" + qName + ")");
 
        if (qName.equalsIgnoreCase("id")) {
        	id = true;
        }
        if (qName.equalsIgnoreCase("firstName")) {
        	firstName = true;
        }
        if (qName.equalsIgnoreCase("lastName")) {
        	lastName = true;
        }
        if (qName.equalsIgnoreCase("emailId")) {
        	emailId = true;
        }
    }
    
    public void endElement(String uri, String localName, String qName) throws SAXException {
        //System.out.println("ends element:" + qName);
    }
    
    public void characters(char ch[], int start, int length) throws SAXException {
        if (id) {
            System.out.println("id: " + new String(ch, start, length));
            id = false;
        }
        if (firstName) {
            System.out.println("Hombre: " + new String(ch, start, length));
            firstName = false;
        }
        if (lastName) {
            System.out.println("Apellido: " + new String(ch, start, length));
            lastName = false;
        }
        
        if(emailId) {
	        System.out.println("Email: " + new String(ch, start, length));
	        System.out.println("***************************************************");
	        emailId = false;
        }
    }
    
}
