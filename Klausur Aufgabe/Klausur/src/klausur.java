import java.util.Scanner;

public class Klausur {

	public static void main(String[] args) {

			   Scanner tastatur = new Scanner(System.in);
			   boolean zahlenRichtig=false;
			   int anfang;
			   int ende;
			   int temp;

			do {
			      System.out.print("Geben Sie die erste Zahl ein:");
			      anfang = tastatur.nextInt();
			      System.out.print("Geben Sie die zweite Zahl ein:");
			      ende = tastatur.nextInt();

			      if (anfang==ende) {
			    	  System.out.print("Beide eingegebene Zahlen sind gleich groß");
			      } else if (anfang>ende) {
			    	  temp=anfang;
			    	  anfang=ende;
			    	  ende=temp;
					  zahlenRichtig=true;
			      } else {
				zahlenRichtig=true;
			      }
			      }while (zahlenRichtig==false);
			
			System.out.println("Die beiden Werte sind "+ anfang + " " + ende);
			
			for (int i=anfang; i<=ende; i++); {
			  if (anfang % 3 == 0) {
			      System.out.println("foo");
			     //anfang=anfang+1;
			  } else if (anfang % 5 == 0) {
			      System.out.println("bar");
			     //anfang=anfang+1;
			} else {
			System.out.println(anfang);
			//anfang=anfang+1;
			}
			}
	}

}
