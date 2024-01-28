package utilities;

public class TemplateIDReader {
	
	private static TemplateIDReader instance = null;
	
	private TemplateIDReader templateIDReader() {
		return new TemplateIDReader();
	}
	
	public static TemplateIDReader getInstance() {
		if(instance == null) {
			instance = new TemplateIDReader();
		}
		return instance;
	}
	
	public String readIDFromUser() {
		// here you woild put the scanner
		// just hard code the return value (e.g "A", or "B", or "C"and rerun it 
		return "C";
	}
}
