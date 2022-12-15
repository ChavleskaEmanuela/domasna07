package zadaca02;

import java.util.List;
import java.util.ArrayList;

public class Main {
public static void main(String[] args) {
	MetodiZaListaNiza object = new MetodiZaListaNiza();
	List<String> lista = new ArrayList<String>();
	lista.add("EMANUELA");
	lista.add("MARIJA");
	lista.add("ANA");
	object.listToArray(lista);
	
	String[] niza = {"emanuela", "marija", "ana"};
	object.arrayToList(niza);
}
}
