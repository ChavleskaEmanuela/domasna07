package zadaca05;

import java.util.Set;
import java.util.TreeSet;
public class Main {
public static void main(String[] args) {
	Set<String> mnozestvo1 = new TreeSet<String>();
	mnozestvo1.add("Crna");
	mnozestvo1.add("Sina");
	mnozestvo1.add("Zelena");
	Set<String> mnozestvo2 = new TreeSet<String>();
	mnozestvo2.add("Crvena");
	mnozestvo2.add("Crna");
	mnozestvo2.add("Zolta");
	
	System.out.println("Presek:");
	mnozestvo1.retainAll(mnozestvo2);
	System.out.println(mnozestvo1);
	
	System.out.println("Unija:");
	mnozestvo1.addAll(mnozestvo2);
	System.out.println(mnozestvo1);
}
}
