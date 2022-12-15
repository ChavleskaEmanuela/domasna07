package zadaca03;

public class SportskiKlub {
private String ime,sport;
private int clenovi;

public String getIme() {
	return ime;
}

public String getSport() {
	return sport;
}

public int getClenovi() {
	return clenovi;
}

public void setIme(String ime) {
	this.ime = ime;
}

public void setSport(String sport) {
	this.sport = sport;
}

public void setClenovi(int clenovi) {
	this.clenovi = clenovi;
}

public SportskiKlub(String ime, String sport, int clenovi) {
	this.ime = ime;
	this.sport = sport;
	this.clenovi = clenovi;
}

public int CompareTo(SportskiKlub obj) {
	SportskiKlub a= (SportskiKlub) obj;
	if (this.ime.equals(a.ime)){
		return 0;
	}
	else
		return this.ime.compareTo(a.ime);
}
}
