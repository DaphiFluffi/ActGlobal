package actGlobal;

public class Konto {

	private String blz;
	private String kontoNr;
	private String name;
	private String bank;
	
	public Konto (String blz, String kontoNr, String name, String bank) {
		this.blz = blz;
		this.kontoNr = kontoNr;
		this.name=name;
		this.bank=bank;
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
	
}