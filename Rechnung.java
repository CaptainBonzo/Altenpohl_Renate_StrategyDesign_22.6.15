import java.util.*;


public class Rechnung {
	
 Printer printType;
 public static List<Artikel> Einkauf;
 
 Rechnung(){
	 Einkauf = new ArrayList<Artikel>();
 }
 
 public void add(Artikel a){
	 Einkauf.add(a);
 }
 
 public void print(){
	printType.print();
 }
 
 public void setPrintType(Printer newPrintType){
	 printType = newPrintType;
 }
 
}
