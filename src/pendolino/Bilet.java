package pendolino;

import java.util.ArrayList;
//pierdo³y
public class Bilet {
	private int cena;
	private String rodzaj;
	private boolean koniec=false;
	String trasa;
	private String nazwa_rezerwujacego;
	
	
	
	public Bilet (int cena,String trasa,String rodzaj , String nazwa_rezerwujacego){
			this.cena=cena;
			this.rodzaj=rodzaj;
			this.trasa=trasa;
			this.nazwa_rezerwujacego=nazwa_rezerwujacego;
		}

	public	String toString()
	{
		return "Bilet o cenie "+ cena+"zl na trase "+trasa+" "+rodzaj+" zostal zarezerwowany" + " przez "+nazwa_rezerwujacego;
	}
}