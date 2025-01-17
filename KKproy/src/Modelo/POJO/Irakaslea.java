package Modelo.POJO;

public class Irakaslea {
	
	private int id_irakas;
	private String izena;
	public Irakaslea(int id_irakas, String izena) {
		
		this.id_irakas = id_irakas;
		this.izena = izena;
	}
	public int getId_irakas() {
		return id_irakas;
	}
	public void setId_irakas(int id_irakas) {
		this.id_irakas = id_irakas;
	}
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	
	

}
