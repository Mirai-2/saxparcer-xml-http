package net.osgg.xmlsaxparser;


public class App 
{
	public static void main(String[] args) {
        
        XMLService service = new XMLService();
        try {
        	service.parse();
        }
        catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
    }

    
}
