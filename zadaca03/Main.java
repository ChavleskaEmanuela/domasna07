package zadaca03;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
public static void main(String[] args) {
	List<SportskiKlub> sk = new ArrayList<SportskiKlub>();
	sk.add(new SportskiKlub("PSG", "fudbal", 28));
	sk.add(new SportskiKlub("Arsenal", "fudbal", 30));
	sk.add(new SportskiKlub("Real Madrid", "fudbal",29));
	sk.add(new SportskiKlub("Liverpool", "fudbal", 25));
	Collections.sort(sk);
	
	for(SportskiKlub a : sk) {
		System.out.println(a.getIme());
		System.out.println(a.getSport());
		System.out.println(a.getClenovi());
	}
	
	
}
}
