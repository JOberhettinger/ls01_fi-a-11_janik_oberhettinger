package konsoleneingabe_aufgabe2_1;

import java.util.Scanner; // Import der Klasse Scanner
public class Rechner
{

	public static void main(String[] args) // Hier startet das Programm
	{

		// Neues Scanner-Objekt myScanner wird erstellt
		Scanner myScanner = new Scanner(System.in);

		System.out.print("Bitte geben Sie eine ganze Zahl ein: ");

		// Die Variable zahl1 speichert die erste Eingabe
		int zahl1 = myScanner.nextInt();

		System.out.print("Bitte geben Sie eine zweite ganze Zahl ein: ");

		// Die Variable zahl2 speichert die zweite Eingabe
		int zahl2 = myScanner.nextInt();

		// Die Addition der Variablen zahl1 und zahl2
		// wird der Variable ergebnis zugewiesen.
		int ergebnisaddition = zahl1 + zahl2;

 System.out.print("\n\n\nErgebnis der Addition lautet: ");
 System.out.print(zahl1 + " + " + zahl2 + " = " + ergebnisaddition);
 myScanner.close();

 		// subtraktion
 		int ergebnissub = zahl1 - zahl2;

System.out.print("\n\n\nErgebnis der subtraktion lautet: ");
System.out.print(zahl1 + " - " + zahl2 + " = " + ergebnissub);

		// multi
		int ergebnismulti = zahl1 * zahl2;

System.out.print("\n\n\nErgebnis der multiplikation lautet: ");
System.out.print(zahl1 + " x " + zahl2 + " = " + ergebnismulti);

		//divi
		int ergebnisdivi = zahl1 / zahl2;

System.out.print("\n\n\nErgebnis der dividierung lautet: ");
System.out.print(zahl1 + " / " + zahl2 + " = " + ergebnisdivi);
myScanner.close();


 }
}