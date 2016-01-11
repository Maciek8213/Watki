package pendolino;

import java.util.ArrayList;

public class Obs³uga {
	private ArrayList<Bilet> bilety = new ArrayList<Bilet>();
	
	public synchronized void rezerwuj_bilet(int cena,String trasa,String rodzaj,String nazwa)
	{	
	
		boolean prawda=false;
		
		if(bilety.isEmpty())//jezeli nie ma biletow
		{
			bilety.add(new Bilet(cena, trasa, rodzaj, nazwa));//dodaj bilet
		}
			else//jezeli sa bilety
		{
		for(int i=0;i< bilety.size();i++)//sprawdz we wszystkich biletach
			{	
				if(bilety.get(i).trasa == trasa)//czy bilet dodawany nie istnieje juz
				{
					System.out.println("nie mozesz zarezerwowac biletu na trase : "+trasa);
					return;
				}else{//jezeli nie istnieje
					prawda=true;
				}
			}
		if(prawda==true)//to dodaj
			{
				bilety.add(new Bilet(cena, trasa, rodzaj , nazwa));
			}
		}
		
	}
	
	public void wyswietl_wszystko(){//wyswietl wszystkie bileciochy
		System.out.println("---------------------------------");
		System.out.println("Lista Zarezerwowanych biletow :");
		for(int i=0;i< bilety.size();i++)
		{
			System.out.println(bilety.get(i));
		}
	}
}