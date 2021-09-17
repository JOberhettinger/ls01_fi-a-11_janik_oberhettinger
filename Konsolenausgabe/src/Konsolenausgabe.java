
public class Konsolenausgabe {

	public static void main(String[] args) {
		
		//AUFGABE 1
		
		System.out.println("Ich komme vom ITDZ Berlin. Ich gehe am OSZ IMT zur Schule.");
		
		System.out.println("\nIch komme vom \"ITDZ Berlin\". \n" + "Ich gehe am OSZ IMT zur Schule.\n");
		
		// DIe .print funktion gibt einen string hinter einanderweg aus, #
		// und .println sorgt dafür das ein Zeilenvorschub vorgenommen wird nach der line
		
		
		//AUFGABE 2
		
		String s = "**************";
		
		System.out.printf("%7.1s\n", s );
		System.out.printf("%8.3s\n", s );
		System.out.printf("%9.5s\n", s );
		System.out.printf("%10.7s\n", s );
		System.out.printf("%11.9s\n", s );
		System.out.printf("%12.11s\n", s );
		System.out.printf("%13.13s\n", s );
		System.out.printf("%8.3s\n", s );
		System.out.printf("%8.3s\n", s );	
		System.out.printf("%8.3s\n", s );	
		
		
		//AUFGABE 3
		//2 komma,
		
		double z1 = 22.4234234;
		double z2 = 111.2222;
		double z3 = 4.0;
		double z4 = 1000000.551;
		double z5 = 97.34;
		
		System.out.printf("\n%.2f\n", z1);
		System.out.printf("%.2f\n", z2);
		System.out.printf("%.2f\n", z3);
		System.out.printf("%.2f\n", z4);
		System.out.printf("%.2f\n", z5);

	}

}
