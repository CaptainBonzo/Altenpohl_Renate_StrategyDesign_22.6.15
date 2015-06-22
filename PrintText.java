import java.util.*;


public class PrintText implements Printer {
	public List<Artikel> list = Rechnung.Einkauf;
	
	public PrintText() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		
		
		
		
		System.out.println( " Artikel \t Einzelpreis ");
		for(int i=0; i < list.size(); i++) {
			Artikel a = list.get(i);
			System.out.println( "  "+ a.name +"  \t\t"+a.preis +" ");
		}
		
	}

}
