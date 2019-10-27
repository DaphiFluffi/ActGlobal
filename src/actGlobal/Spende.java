package actGlobal;

public class Spende {

	private double betrag;
	private boolean quittung;
	private String spendername;
	private Status status;

	public Spende(double betrag, boolean quittung, String spendername, Status s) {
		this.betrag = betrag;
		this.quittung = quittung;
		this.spendername = spendername;
		status = Status.IN_BEARBEITUNG; //vielleicht dafür auch noch einen Getter Setter?
	}


	public double getBetrag() {
		return betrag;
	}

	public boolean getQuittung() {
		return quittung;
	}

	public String getSpendername() {
		return spendername;
	}

	public void setBetrag(double betrag) {
		this.betrag = betrag;
	}

	public void setQuittung(boolean quittung) {
		this.quittung = quittung;
	}

	public void setSpendername(String spendername) {
		this.spendername = spendername;
	}
}