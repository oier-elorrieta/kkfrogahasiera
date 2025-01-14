package Modelo.POJO;

public class Ikaslea {
	
	private int adina;
	private String izena;
	public Ikaslea(int adina, String izena) {
		super();
		this.adina = adina;
		this.izena = izena;
	}
	public int getAdina() {
		return adina;
	}
	public void setAdina(int adina) {
		this.adina = adina;
	}
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	@Override
	public String toString() {
		return "Ikaslea [adina=" + adina + ", izena=" + izena + "]";
	}

	
}
