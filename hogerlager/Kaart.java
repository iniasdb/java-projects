package hogerlager;

public class Kaart {

	public Kaart(String waardeString, String beeldString) {
		this.waardeString = waardeString;
		this.beeldString = beeldString;
		toInt();
	}
	
	public Kaart(int waarde, int beeld) {
		this.waarde = waarde;
		this.beeld = beeld;
		intToString();
	}
	
	public Kaart() {
		this.waarde = (int) (Math.random()*13)+1;
		this.beeld = (int) (Math.random()*4)+1;
		intToString();
	}
	
	private void toInt() {
		
		switch (waardeString) {
		case "een":
			this.waarde = 1;
			break;
		case "twee":
			this.waarde = 2;
			break;
		case "drie":
			this.waarde = 3;
			break;
		case "vier":
			this.waarde = 4;
			break;
		case "vijf":
			this.waarde = 5;
			break;
		case "zes":
			this.waarde = 6;
			break;
		case "zeven":
			this.waarde = 7;
			break;
		case "acht":
			this.waarde = 8;
			break;
		case "negen":
			this.waarde = 9;
			break;
		case "tien":
			this.waarde = 10;
			break;
		case "zot":
			this.waarde = 11;
			break;
		case "vrouw":
			this.waarde = 12;
			break;
		case "koning":
			this.waarde = 13;
			break;
		case "aas":
			this.waarde = 1;
			break;
		}
		
		switch (beeldString) {
		case "klaveren":
			this.beeld = 1;
			break;
		case "schoppen":
			this.beeld = 2;
			break;
		case "ruiten":
			this.beeld = 3;
			break;
		case "harten":
			this.beeld = 4;
			break;
		}
		
	}
	
	private void intToString() {
		
		switch (waarde) {
		case 1:
			this.waardeString = "een of aas";
			break;
		case 2:
			this.waardeString = "twee";
			break;
		case 3:
			this.waardeString = "drie";
			break;
		case 4:
			this.waardeString = "vier";
			break;
		case 5:
			this.waardeString = "vijf";
			break;
		case 6:
			this.waardeString = "zes";
			break;
		case 7:
			this.waardeString = "zeven";
			break;
		case 8:
			this.waardeString = "acht";
			break;
		case 9:
			this.waardeString = "negen";
			break;
		case 10:
			this.waardeString = "tien";
			break;
		case 11:
			this.waardeString = "zot";
			break;
		case 12:
			this.waardeString = "vrouw";
			break;
		case 13:
			this.waardeString = "koning";
			break;
		/*case 14:
			this.waardeString = "aas";
			break;*/
		}
		
		switch (beeld) {
		case 1:
			this.beeldString = "klaveren";
			break;
		case 2:
			this.beeldString = "schoppen";
			break;
		case 3:
			this.beeldString = "ruiten";
			break;
		case 4:
			this.beeldString = "harten";
			break;
		}
		
	}
	
	public String getWaardeString() {
		return waardeString;
	}
	
	public int getWaardeInt() {
		return waarde;
	}
	
	public String getBeeldString() {
		return beeldString;
	}
	
	public int getBeeldInt() {
		return beeld;
	}
	
	public String getKleur() {
		if (beeld == 1 || beeld == 2) {
			return "zwart";
		} else {
			return "rood";
		}
	}
	
	public int getKleurInt() {
		if (beeld == 1 || beeld == 2) {
			return 1;
		} else if (beeld == 3 || beeld == 4) {
			return 2;
		} 
		return 0;
	}
	
	public boolean zelfde(Kaart kaart) {
		if (this.beeld == kaart.beeld && this.waarde == kaart.waarde) {
			return true;
		} else /*if (!(this.beeld == kaart.beeld && this.waarde == kaart.waarde))*/ {
			return false;
		}
	}
	
	public String vergelijk(Kaart kaart) {
		if (this.waarde > kaart.waarde) {
			return "kaart 1 is groter dan kaart 2";
		} else if (this.waarde < kaart.waarde) {
			return "kaart 2 is groter dan kaart 1";
		} else {
			return "even groot";
		}
	}
	
	public boolean isHoger(Kaart kaart) {
		if (this.waarde > kaart.waarde) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isZelfdeWaarde(Kaart kaart) {
		if (this.waarde == kaart.waarde) {
			return true;
		} else /*if (!(this.beeld == kaart.beeld && this.waarde == kaart.waarde))*/ {
			return false;
		}
	}	
	private int waarde;
	private String waardeString;
	private int beeld;
	private String beeldString;

}
