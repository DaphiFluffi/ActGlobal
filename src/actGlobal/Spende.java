package actGlobal;

public class Spende {

	//Klassenvariablen fuer Betrag, Quittung, Spendername und Status anlegen
	private double betrag;
	private boolean quittung;
	private String spendername;
	private Status status;
	//jede Spende muss genau ein Konto und genau eine Aktion haben
	//deshalb benoetigt die Klasse Spende die entsprechenden Klassenattribute
	private Aktion aktion;
	private Konto konto;

	
	//parametrisierter Konstruktor 
	//da genau ein Konto und genau eine Aktion pro Spende existieren muss, werden die Klassenvariablen in den Konstruktor als Parameter uebergeben
	//so kann kein Objekt der Klasse Spende instanziiert werden, ohne ein Konto und eine Aktion angegeben zu haben 
	public Spende(double betrag, boolean quittung, String spendername, Status status, Konto konto, Aktion aktion) {
		this.betrag = betrag;
		this.quittung = quittung;
		this.spendername = spendername;
		this.status = Status.IN_BEARBEITUNG; //als default wert?
		
		// Wenn statt eines richtigen Konto- oder Aktion-Objektes null übergeben wurde, soll diese Fehlermeldung erscheinen
		if(konto == null ) {
			System.out.println("Die Angabe des Kontos fehlt. Bitte nochmal versuchen.");
			System.exit(0);
		}
		
		if(aktion == null ) {
			System.out.println("Die Angabe der Aktion fehlt. Bitte nochmal versuchen.");
			System.exit(0);
		}
		
		this.konto = konto;
		this.aktion = aktion;
	}

	//getter Methoden fuer die private Klassenattribute
	public double getBetrag() {
		return betrag; 
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
	
	public Aktion getAktion() {
		return aktion;
	}
	
	public Konto getKonto() {
		return konto;
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


	public void setAktion(Aktion aktion) {
		this.aktion = aktion;
	}


	public void setKonto(Konto konto) {
		this.konto = konto;
	}
	
	//readonly? keine setter methode für Status
}