import java.util.*;

public class PrintHtml implements Printer {
	public List<Artikel> list = Rechnung.Einkauf;
	public PrintHtml() {
		// TODO Auto-generated constructor stub
	}
	public void print(){
		System.out.println("<table>\n<tr>\n<td>Artikel</td>\n<td>Preis</td>\n</tr>");
		
		
		for(Artikel a: list){
			System.out.println( "<tr>\n<td>" + a.name + "</td>\n<td>"+ a.preis +"</td>\n</tr>");
		}
		
		System.out.println("</table>;");
		
		
		};

}
