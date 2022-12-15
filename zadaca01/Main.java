package zadaca01;

import java.util.List;
import java.util.ArrayList;

public class Main {
public static void main(String[] args) {
	List<String> lekovi = new ArrayList<String>();
	lekovi.add("Analgin");
	lekovi.add("Aspirin");
	lekovi.add("Yasmin");
	lekovi.add("Strepsils");
	lekovi.add("Paracetamol");
	
	if(lekovi.get(lekovi.size() - 1).equals("Paracetamol")) {
		System.out.println("Lekot pomaga za namaluvanje na telesnata temperatura.");
	}
	else
	{
		System.out.println("Namenata na lekot e nepoznata.");
	}
}
}
