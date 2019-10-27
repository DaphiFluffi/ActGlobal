package actGlobal;

import java.util.ArrayList;

public class Aktion {

	public String name;
	public double spenden;
	public double spendenziel;

	//Hier muss eine Beziehung zw. Aktion und Organisator,Konto sowie Spende machen
	private Organisator organisator; // Muss genau ein Organisator haben
	private Konto konto; // Muss genau eine Konto haben
	private ArrayList<Spende> spendenListe = new ArrayList<Spende>(); // Muss ein ArrayList von Spende haben, weil eine Aktion kann 0 oder mehrere Spende haben
	
	public Aktion (String name, double spenden, double spendenziel, Organisator organisator, Konto konto) {
		this.name = name;
		this.spenden = spenden;
		this.spendenziel = spendenziel;
		this.organisator = organisator;
		this.konto = konto;
	}

	public String getName() {
		return name;
	}

	public double getSpenden() {
		return spenden;
	}

	public double getSpendenziel() {
		return spendenziel;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSpenden(double spenden) {
		this.spenden = spenden;
	}

	public void setSpendenziel(double spendenziel) {
		this.spendenziel = spendenziel;
	}
	
	public Organisator getOrganisator() {
		return organisator;
	}

	public void setOrganisator(Organisator organisator) {
		this.organisator = organisator;
	}

	public Konto getKonto() {
		return konto;
	}

	public void setKonto(Konto konto) {
		this.konto = konto;
	}

	public ArrayList<Spende> getSpendenListe() {
		return spendenListe;
	}

	public void setSpendenListe(ArrayList<Spende> spendenListe) {
		this.spendenListe = spendenListe;
	}
}