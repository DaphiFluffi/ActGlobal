package actGlobal;

public class Konto {

	private String blz;
	private String kontoNr;
	private String name;
	private String bank;
	
	//Hier muss eine Beziehung zw. Konto und Aktion sowie Spende machen
	private Aktion aktion; //wird hier genau eine Aktion aufgerufen.
	private Spende spende; //wird hier genau eine Spende aufgerufen
	
	public Konto (String blz, String kontoNr, String name, String bank, Aktion aktion, Spende spende) {
		this.blz = blz;
		this.kontoNr = kontoNr;
		this.name = name;
		this.bank = bank;
		this.aktion = aktion;
		this.spende = spende;
	}
	
	public String getBLZ() {
		return blz;
	}
	
	public String getKontoNr() {
		return kontoNr;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBank() {
		return bank;
	}
	
	public Aktion getAktion() {
		return aktion;
	}
	
	public Spende getSpende() {
		return spende;
	}
	
	public void setBLZ(String blz) {
		this.blz = blz;
	}
	
	public void setKontoNr(String kontoNr) {
		this.kontoNr = kontoNr;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBank(String bank) {
		this.bank = bank;
	}
	
	public void getAktion(Aktion aktion) {
		this.aktion = aktion;
	}
	
	public void getSpende(Spende spende) {
		this.spende = spende;
	}
}