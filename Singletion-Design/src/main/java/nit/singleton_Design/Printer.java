package nit.singleton_Design;

public class Printer 
{
	private static Printer instance;
	
	private Printer() {
		System.out.println("private default Constructor");
	}
	
	public static Printer getPrinter() {
		
		System.out.println("sttaic factory");
		if(instance!=null)
			return instance;
		return instance=new Printer();
	}
}
