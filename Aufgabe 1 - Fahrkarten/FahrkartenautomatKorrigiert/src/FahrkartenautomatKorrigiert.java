import java.util.Scanner;

class FahrkartenautomatKorrigiert
{
    public static void main(String[] args)
    {
        boolean endlos = true;
    	while(endlos) {
	        System.out.println("Fahrkartenbestellvorgang:\n"+
                    "==========================\n");
    	       Scanner tastatur = new Scanner(System.in);
    	       double zuZahlenderBetrag = fahrkartenbestellungErfassen(tastatur);
    	       double r�ckgabebetrag = fahrkatenBezahlen(tastatur, zuZahlenderBetrag);
    	       fahrkartenAusgabe();
    	       rueckgeldAusgabe(zuZahlenderBetrag, r�ckgabebetrag);
    	       
    	        System.out.println("\nVergessen Sie nicht, den Fahrschein\n"+
                        "vor Fahrtantritt entwerten zu lassen!\n"+
                        "Wir w�nschen Ihnen eine gute Fahrt.");
    	        System.out.println("M�chten sie weitere Tickets bestellen?");

    	        String antwort = tastatur.toString();
    	        	if (antwort == "Ja") {
    	        		endlos = true;
    	        	}else {
    	        		endlos = false;
    	        	}
    	        
    	}

    }
    //W�hlen Sie ihre Wunschfahrkarte f�r Berlin AB aus:
    //Einzelfahrschein Regeltarif AB [2,90 EUR] (1)
    //Tageskarte Regeltarif AB [8,60 EUR] (2)
    //Kleingruppen-Tageskarte Regeltarif AB [23,50 EUR] (3)

    public static double fahrkartenbestellungErfassen(Scanner tastatur) {
    	int ticketTyp = 0;
    	double ticketPreis;
    	boolean wahlrichtig = false;
    	double zuZahlenderBetrag;
    	
        System.out.println("W�hlen Sie ihre Wunschfahrkarte f�r Berlin AB aus:");
        System.out.println("Einzelfahrschein Regeltarif AB [2,90 EUR] (1)");
        System.out.println("Tageskarte Regeltarif AB [8,60 EUR] (2)");
        System.out.println("Kleingruppen-Tageskarte Regeltarif AB [23,50 EUR] (3)");
        
        while(!wahlrichtig) {
        	System.out.print("Ihre Wahl: ");
        	ticketTyp = tastatur.nextInt();
        	if (ticketTyp < 3 || ticketTyp > 1 ) {
        		System.out.println(">>falscheEingabe");
        	} else {
        		wahlrichtig = true;
        	}
        }//end of while
        
        if(ticketTyp == 1) {
        	ticketPreis = 2.90;
        }else if(ticketTyp == 2) {
        	ticketPreis = 8.60;
        }else {
        	ticketPreis = 23.50;
        }
    	
        int tickets = tastatur.nextInt();
        System.out.print("Anzahl der Tickets: ");
        zuZahlenderBetrag = ticketPreis * tickets;
        return zuZahlenderBetrag;
    }
    public static double fahrkatenBezahlen(Scanner tastatur, double zuZahlenderBetrag) {
        double eingezahlterGesamtbetrag = 0.00;
        while(eingezahlterGesamtbetrag < zuZahlenderBetrag)
        {
            System.out.printf("Noch zu zahlen: %.2f Euro%n" ,(zuZahlenderBetrag - eingezahlterGesamtbetrag));
            System.out.print("Eingabe (mind. 5Ct, h�chstens 2 Euro): ");
            double eingeworfeneM�nze = tastatur.nextDouble();
            eingezahlterGesamtbetrag += eingeworfeneM�nze;
        }
        return eingezahlterGesamtbetrag;
    }
    public static void fahrkartenAusgabe() {
        int millisekunden = 250;
        warte(millisekunden);
        System.out.println("\n\n");
    }
    public static void warte(int millisekunden)    
        {
            System.out.println("\nFahrschein wird ausgegeben");
            for (int i = 0; i < 26; i++) {
               System.out.print("=");
               try {
                 Thread.sleep(millisekunden);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
            }
        }
    public static void rueckgeldAusgabe(double zuZahlenderBetrag,double r�ckgabebetrag ) {
        int betrag = (int) r�ckgabebetrag;
        int zuZahlenderBetragint = (int) zuZahlenderBetrag;
        betrag = betrag-zuZahlenderBetragint;
        String einheit = "�";
        muenzeAusgabe(betrag, einheit);
    }
    public static void muenzeAusgabe(int betrag, String einheit) {
        if(betrag > 0.00)
        {
            System.out.printf("Der R�ckgabebetrag in H�he von %s %s " ,betrag, einheit);
            System.out.println("wird in folgenden M�nzen ausgezahlt:");

            while(betrag >= 2.0) // 2 EURO-M�nzen
            {
               System.out.println("2 EURO");
              betrag -= 2.0;
            }
            while(betrag >= 1.0) // 1 EURO-M�nzen
            {
               System.out.println("1 EURO");
              betrag -= 1.0;
            }
            while(betrag >= 0.5) // 50 CENT-M�nzen
            {
               System.out.println("50 CENT");
              betrag -= 0.5;
            }
            while(betrag >= 0.2) // 20 CENT-M�nzen
            {
               System.out.println("20 CENT");
              betrag -= 0.2;
            }
            while(betrag >= 0.1) // 10 CENT-M�nzen
            {
               System.out.println("10 CENT");
              betrag -= 0.1;
            }
            while(betrag >= 0.05)// 5 CENT-M�nzen
            {
               System.out.println("5 CENT");
              betrag -= 0.05;
            }
        }
    }
}