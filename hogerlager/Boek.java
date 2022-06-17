package hogerlager;

import java.util.ArrayList;

public class Boek {

	public Boek() {
		kaarten = new ArrayList<Kaart>();
		for (int i = 1; i <= 4; i++) {
			for (int x = 1; x <= 13; x++) {
				kaarten.add(new Kaart(x, i));
			}
		}
	}
	
	public void printKaarten() {
		for (int i = 0; i < 52; i++) {
			System.out.println(kaarten.get(i).getWaardeInt() + " " + kaarten.get(i).getBeeldInt());
		}
	}
	
	public void schud() {
		
		for (int i = 0; i<10000; i++) {
			int rand = (int) (Math.random()*51)+1;
			Kaart temp = this.kaarten.get(0);
			this.kaarten.set(0, this.kaarten.get(rand));
			this.kaarten.set(rand, temp);
		}
	}
	
	public Kaart neemAf() {
		teller++;
		return this.kaarten.get(teller);
	}

	private ArrayList<Kaart> kaarten;
	int teller = -1;

}
