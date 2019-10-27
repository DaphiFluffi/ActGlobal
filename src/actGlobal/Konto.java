package actGlobal;

public class Konto {

	private String blz;
	private String kontoNr;
	private String name;
	private String bank;
	
	//Eine Beziehung zw. Konto und Aktion sowie Spende wurde gemacht, da laut UML Diagramme muss eine Konto mit genau einer Aktion und genau einer Spende verknupfen.
	//Hat die Klasse Konto aufgerufen wird, muss unbedingt Aktion und Spende auch instanziiren sonst wird Fehlermeldung auftaucht.
	private Aktion aktion;
	private Spende spende;
	
	public Konto (String blz, String kontoNr, String name, String bank, Aktion aktion, Spende spende) {
		this.blz = blz;
		this.kontoNr = kontoNr;
		this.name = name;
		this.bank = bank;
		this.aktion = aktion;
		this.spende = spende;
		
		//Wenn Aktion und oder Spende Objekte als null eingegeben wuerden, dann taucht Fehlermeldung auf
		if(aktion == null){
			System.out.println("Die Angabe der Aktion fehlt. Bitte nochmal versuchen");
			System.exit(0);
		}
		
		if(spende == null){
			System.out.println("Die Angabe der Spende fehlt. Bitte nochmal versuchen");
			System.exit(0);
		}
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