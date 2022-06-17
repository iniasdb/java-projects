package hogerlager;

import java.util.Scanner;

public class main_hogerlager_def {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Boek boek = new Boek();
		String antwoord;
		boolean gewonnen = false;
		boolean verloren = false;
		int i = 0;
		int keerJuist = 0;
		
		boek.schud();
		//boek.printKaarten();

		Kaart kaart1 = boek.neemAf();
		Kaart kaart2 = boek.neemAf();

		while (!gewonnen && !verloren) {

			//System.out.println(kaarten.get(i).getBeeldString() + " " + kaarten.get(i).getWaardeString());
			System.out.println(kaart1.getBeeldString() + " " + kaart1.getWaardeString());
			System.out.println("hoger of lager?");
			antwoord = scanner.next();
			
			//if (kaarten.get(i).isZelfdeWaarde(kaarten.get(i+1))) {
			if (kaart1.isZelfdeWaarde(kaart2)) {
				keerJuist++;
				kaart1 = kaart2;
				kaart2 = boek.neemAf();
			} else if (kaart1.getWaardeInt() == 13 || kaart1.getWaardeInt() == 1 || kaart2.getWaardeInt() == 13 || kaart2.getWaardeInt() == 1) {
				keerJuist++;
				kaart1 = kaart2;
				kaart2 = boek.neemAf();
			} else if (kaart2.isHoger(kaart1) && antwoord.equalsIgnoreCase("hoger")) {
				keerJuist++;
				kaart1 = kaart2;
				kaart2 = boek.neemAf();
			} else if (kaart1.isHoger(kaart2) && antwoord.equalsIgnoreCase("lager")) {
				keerJuist++;
				kaart1 = kaart2;
				kaart2 = boek.neemAf();
			} else {
				System.out.println("game over");
				System.out.println(kaart2.getBeeldString() + " " + kaart2.getWaardeString());
				verloren = true;
				System.out.println(keerJuist + " keer juist");
			}
			
			if (keerJuist == 7) {
				System.out.println("gewonnen");
				gewonnen = true;
			}
			
			i++;
		}
	
		scanner.close();
		
//		boek.schud();
	}

}
