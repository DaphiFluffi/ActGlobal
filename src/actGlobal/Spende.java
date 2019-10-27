package actGlobal;

public class Spende {

	//Klassenvariablen fuer Betrag, Quittung, Spendername und Status anlegen
	private double betrag;
	private boolean quittung;
	private String spendername;
	private Status status;
	private Aktion aktion;
	private Konto konto;
	
	//parametrisierter Konstruktor 
	public Spende(double betrag, boolean quittung, String spendername, Status status, Konto konto, Aktion aktion) {
		this.betrag = betrag;
		this.quittung = quittung;
		this.spendername = spendername;
		this.status = Status.IN_BEARBEITUNG; //als default wert?
		this.konto = konto;
		this.aktion = aktion;
	}

	//getter Methoden fuer die private Klassenattribute
	public double getBetrag() {
		return betrag; //this? 
	}

	public boolean getQuittung() {
		return quittung;
	}

	public String getSpendername() {
		return spendername;
	}
	
	public Status getStatus() {
		return this.status;
	}

	//setter Methoden die private Klassenattribute
	public void setBetrag(double betrag) {
		this.betrag = betrag;
	}

	public void setQuittung(boolean quittung) {
		this.quittung = quittung;
	}

	public void setSpendername(String spendername) {
		this.spendername = spendername;
	}

	public Aktion getAktion() {
		return aktion;
	}

	public void setAktion(Aktion aktion) {
		this.aktion = aktion;
	}

	public Konto getKonto() {
		return konto;
	}

	public void setKonto(Konto konto) {
		this.konto = konto;
	}
	
	//readonly? keine setter methode für Status
}