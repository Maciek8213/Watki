package watki;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import pendolino.Bilet;
import pendolino.Obs³uga;

public class Glowne{
	
	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws InterruptedException, ExecutionException, IOException
	{
		Scanner input = new Scanner(System.in);
		ExecutorService exe = Executors.newFixedThreadPool(4);

		menuUi();
		int numer_watku=0;
		while(true)
		{	
			
			String komenda;
			komenda=input.nextLine();	
			if(komenda.equals("1"))
			{	
				exe.submit(new Watek(2, "warszawa", "ulgowy" , nazwa_watku(numer_watku), "rezerwuj"));
				
			}
			else if(komenda.equals("2"))
			{	
				exe.submit(new Watek(3, "krakow", "ulgowy", nazwa_watku(numer_watku),"rezerwuj"));
			}
			else if(komenda.equals("3"))
			{
				exe.submit(new Watek(4, "szczecin", "ulgowy", nazwa_watku(numer_watku),"rezerwuj"));
			}
			else if(komenda.equals("4"))
			{
				exe.submit(new Watek(10, "tarnow", "ulgowy" , nazwa_watku(numer_watku),"rezerwuj"));
			}
			else if(komenda.equals("5"))
			{
				exe.submit(new Watek(1, null, null , null,"wyswietl"));
				
			}
			numer_watku++;
			menuUi();
		}
	}

	private static String nazwa_watku(int numer_watku) {
		return "_"+String.valueOf(numer_watku)+"_";
	}

	private static void menuUi() {
		System.out.println("Wybierz bilet :");
		System.out.println("1. warszawa ulgowy 2zl");
		System.out.println("2. krakow ulgowy 3zl");
		System.out.println("3. szczecin ulgowy 4zl");
		System.out.println("4. tarnow ulgowy 10zl");
		System.out.println("5. pokaz zarezerwowane\n");
		
	}	
}