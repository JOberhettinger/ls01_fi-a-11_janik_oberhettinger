package konsoleneingabe;

import java.util.Scanner;

public class koneingabe {

	public static void main(String[] args) {
		
		String name;
		int alter;
		float koerpergroesse;
		char geschlecht;
		Scanner myScanner= new Scanner(System.in);
		
		System.out.print("Geben Sie Ihren Namen ein: ");
		name = myScanner.next();
		System.out.println(name + " " + name);
		
		System.out.print("Geben Sie Ihr Alter ein");
		alter = myScanner.nextInt();
		System.out.println(alter);
		alter = alter + 1;
		System.out.println(alter);
		
		System.out.print("Geben Sie bitte ihre Größe an.");
		koerpergroesse = myScanner.nextFloat();
		System.out.println(koerpergroesse);
		
		System.out.print("Geben Sie Ihr Geschlecht (w/m/d)");
		geschlecht = myScanner.next().charAt(0);
		System.out.println(geschlecht);
		myScanner.close();
		
				
	}

}
