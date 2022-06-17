import javax.swing.JOptionPane;

//import java.util.Scanner;

public class alfabet {

	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		System.out.println("typ woord. ");
		//String woord = scanner.next();
		String woord = JOptionPane.showInputDialog("typ woord");

		String woord2 = "";
		
		for (int i = 0; i < woord.length();) {
			String x = woord.substring(i, i+1);
			
			if (x.equalsIgnoreCase("a")) {
				System.out.print("alfa ");
				woord2 += " alfa";
			} else if (x.equalsIgnoreCase("b")) {
				System.out.print("bravo ");
				woord2 += " bravo";
			} else if (x.equalsIgnoreCase("c")) {
				System.out.print("charlie ");
				woord2 += " charlie";
			} else if (x.equalsIgnoreCase("d")) {
				System.out.print("delta ");
				woord2 += " delta";
			} else if (x.equalsIgnoreCase("e")) {
				System.out.print("echo ");
				woord2 += " echo";
			} else if (x.equalsIgnoreCase("f")) {
				System.out.print("foxtrot ");
				woord2 += " foxtrot";
			} else if (x.equalsIgnoreCase("g")) {
				System.out.print("golf ");
				woord2 += " golf";
			} else if (x.equalsIgnoreCase("h")) {
				System.out.print("hotel ");
				woord2 += " hotel";
			} else if (x.equalsIgnoreCase("i")) {
				System.out.print("india ");
				woord2 += " india";
			} else if (x.equalsIgnoreCase("j")) {
				System.out.print("juliet ");
				woord2 += " juliet";
			} else if (x.equalsIgnoreCase("k")) {
				System.out.print("kilo ");
				woord2 += " kilo";
			} else if (x.equalsIgnoreCase("l")) {
				System.out.print("lima ");
				woord2 += " lima";
			} else if (x.equalsIgnoreCase("m")) {
				System.out.print("mike ");
				woord2 += " mike";
			} else if (x.equalsIgnoreCase("n")) {
				System.out.print("november ");
				woord2 += " november";
			} else if (x.equalsIgnoreCase("o")) {
				System.out.print("oscar ");
				woord2 += " oscar";
			} else if (x.equalsIgnoreCase("p")) {
				System.out.print("papa ");
				woord2 += " papa";
			} else if (x.equalsIgnoreCase("q")) {
				System.out.print("quebec ");
				woord2 += " quebec";
			} else if (x.equalsIgnoreCase("r")) {
				System.out.print("romeo ");
				woord2 += " romeo";
			} else if (x.equalsIgnoreCase("s")) {
				System.out.print("sierra ");
				woord2 += " sierra";
			} else if (x.equalsIgnoreCase("t")) {
				System.out.print("tango ");
				woord2 += " tango";
			} else if (x.equalsIgnoreCase("u")) {
				System.out.print("uniform ");
				woord2 += " uniform";
			} else if (x.equalsIgnoreCase("v")) {
				System.out.print("victor ");
				woord2 += " victor";
			} else if (x.equalsIgnoreCase("w")) {
				System.out.print("whiskey ");
				woord2 += " whiskey";
			} else if (x.equalsIgnoreCase("x")) {
				System.out.print("x-ray ");
				woord2 += " x-ray";
			} else if (x.equalsIgnoreCase("y")) {
				System.out.print("yankee ");
				woord2 += " yankee";
			} else if (x.equalsIgnoreCase("z")) {
				System.out.print("zulu ");
				woord2 += " zulu";
			} else if (x.equalsIgnoreCase("0")) {
				System.out.print("zero ");
				woord2 += " zero";
			} else if (x.equalsIgnoreCase("1")) {
				System.out.print("one ");
				woord2 += " one";
			} else if (x.equalsIgnoreCase("2")) {
				System.out.print("two ");
				woord2 += " two";
			} else if (x.equalsIgnoreCase("3")) {
				System.out.print("three ");
				woord2 += " three";
			} else if (x.equalsIgnoreCase("4")) {
				System.out.print("four ");
				woord2 += " four";
			} else if (x.equalsIgnoreCase("5")) {
				System.out.print("five ");
				woord2 += " five";
			} else if (x.equalsIgnoreCase("6")) {
				System.out.print("six ");
				woord2 += " six";
			} else if (x.equalsIgnoreCase("7")) {
				System.out.print("seven ");
				woord2 += " seven";
			} else if (x.equalsIgnoreCase("8")) {
				System.out.print("eight ");
				woord2 += " eight";
			} else if (x.equalsIgnoreCase("9")) {
				System.out.print("nine ");
				woord2 += " nine";
			} else {
				System.out.print(x);
				woord2 += " " + x;
			}
			
			i++;
		}

		System.out.println();
		System.out.println(woord2.replaceAll(" a ", ""));
		JOptionPane.showMessageDialog(null, woord2, "de manne", 1);

		
		//scanner.close();
	}

}
