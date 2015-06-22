
public class Main {

	public static void main(String[] args) {
		Artikel milch  = new Artikel("Milch",1.22);
		Artikel apfel  = new Artikel("Apfel",0.43);
		
		Rechnung claudia = new Rechnung();
		
		claudia.add(apfel);
		claudia.add(apfel);
		claudia.add(milch);
		
		
		claudia.setPrintType(new PrintText());
		
		claudia.print();
		
		claudia.setPrintType(new PrintHtml());
		
		claudia.print();
	}

}
