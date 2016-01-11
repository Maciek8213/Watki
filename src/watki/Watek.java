package watki;

import java.util.concurrent.Callable;

import pendolino.Bilet;
import pendolino.Obs³uga;

public class Watek implements Callable<String>{
	
	private int cena;
	private String trasa;
	private String rodzaj;
	private String nazwa_watku;
	private String info;
	public final static Obs³uga m=new Obs³uga();
	
	public Watek(int cena,String trasa,String rodzaj, String nazwa, String info)
	{
		this.cena=cena;
		this.trasa=trasa;
		this.rodzaj=rodzaj;
		nazwa_watku=nazwa;
		this.info=info;
		
	}

	@Override
	public String call() throws Exception {
		if(info.equals("rezerwuj"))
		{
			m.rezerwuj_bilet(cena,trasa,rodzaj,nazwa_watku);
		}
		else if (info.equals("wyswietl"))
		{
			m.wyswietl_wszystko();
		}
		return "zakonczylem";
	}
}