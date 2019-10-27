package actGlobal;

import java.util.ArrayList;

public class Organisator {
	
	//Hier werden die Eingabeforderungen im String gespeichert
	private String email;  
	private String nachname;
	private String vorname;
	private String passwort;
	
	// mithilfe der folgendenen Zuweisung 
	private ArrayList<Aktion> aktionsListe = new ArrayList<Aktion>();
	
	
	public Organisator(String email, String nachname, String vorname, String passwort) { 
		
		// parametrisierter Konstruktor
		this.setEmail(email);
		this.setNachname(nachname);
		this.setVorname(vorname);
		this.setPasswort(passwort);

	}
	
	// Getter&Setter fuer die privatisierten Attribute
	
	
	
	public ArrayList<Aktion> getAktionsListe() {
		return aktionsListe;
	}
	public void setAktionsListe(ArrayList<Aktion> aktionsListe) {
		this.aktionsListe = aktionsListe;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

}