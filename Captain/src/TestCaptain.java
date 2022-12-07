//import Captain;

public class TestCaptain {

	public static void main(String[] args) {
		//Erzeugen der Objekte
				Captain cap1 = new Captain ( "Jean Luc", "Picard", 2364, 4500.0);
				Captain cap2 = new Captain ( "Azetbur", "Gorkon", 2373, 0.0);
				Captain cap3 = new Captain ( "Graubart", "Grogon", 2350, 2.2);
			    /* TODO: 9. Erzeugen Sie ein zusaetzliches Objekt cap3 und geben Sie es auch auf der Konsole aus, 
			     * die Attributwerte denken Sie sich aus.
			     */  
			      
			    Captain cap4 = new Captain ( "Peter", "Lustig", 2550, 300.0);
				Captain cap5 = new Captain ( "Kante", "Grantel", 1234, 5114.2);

			    /*TODO: 10. Erzeugen Sie zwei zusaetzliche Objekte cap4 und cap5
			     * mit dem Konstruktor, der den Namen und Vornamen initialisiert,
			     * die Attributwerte denken Sie sich aus.
			     */
			    
			    
			    //Setzen der Attribute
			    /* TODO: 11. Fuegen Sie cap4 und cap5 jeweils ein Gehalt hinzu, 
			     * die Attributwerte denken Sie sich aus.
			     * Geben Sie cap4 und cap5 auch auf dem Bildschirm aus.
			     */

		        //Bildschirmausgabe
			    System.out.println("Name: " + cap1.getSurname());
			    System.out.println("Vorname: " + cap1.getName());
			    System.out.println("Kapit�n seit: " + cap1.getCaptainYears());
			    System.out.println("Gehalt: " + cap1.getSalary() + " F�derationsdukaten");
			    System.out.println("Vollname: " + cap1.vollname());
			    System.out.println(cap1 + "\n"); //Die toString() Methode wird aufgerufen

		        System.out.println("\nName: " + cap2.getSurname());
			    System.out.println("Vorname: " + cap2.getName());
			    System.out.println("Kapit�n seit: " + cap2.getCaptainYears());
			    System.out.println("Gehalt: " + cap2.getSalary() + " Darsek");
			    System.out.println("Vollname: " + cap2.vollname());
			    System.out.println(cap2 + "\n"); //Die toString() Methode wird aufgerufen

		        System.out.println("\nName: " + cap3.getSurname());
			    System.out.println("Vorname: " + cap3.getName());
			    System.out.println("Kapit�n seit: " + cap3.getCaptainYears());
			    System.out.println("Gehalt: " + cap3.getSalary() + " Darsek");
			    System.out.println("Vollname: " + cap3.vollname());
			    System.out.println(cap3 + "\n"); //Die toString() Methode wird aufgerufen

		        System.out.println("\nName: " + cap4.getSurname());
			    System.out.println("Vorname: " + cap4.getName());
			    System.out.println("Kapit�n seit: " + cap2.getCaptainYears());
			    System.out.println("Gehalt: " + cap2.getSalary() + " Darsek");
			    System.out.println("Vollname: " + cap2.vollname());
			    System.out.println(cap2 + "\n"); //Die toString() Methode wird aufgerufen

				System.out.println("\nName: " + cap2.getSurname());
			    System.out.println("Vorname: " + cap2.getName());
			    System.out.println("Kapit�n seit: " + cap2.getCaptainYears());
			    System.out.println("Gehalt: " + cap2.getSalary() + " Darsek");
			    System.out.println("Vollname: " + cap2.vollname());
			    System.out.println(cap2 + "\n"); //Die toString() Methode wird aufgerufen

			    //TODO: Ausgabe von cap4, erg�nzen Sie die fehlenden Methodenaufrufen
			    //System.out.println("Name: "  );
			    //System.out.println("Vorname: "  );
			    //System.out.println("Kapit�n seit: "  );
			    //System.out.println("Gehalt: " +  " F�derationsdukaten");
			    //System.out.println("Vollname: "  );
			    //System.out.println( + "\n"); //Die toString() Methode wird aufgerufen
			    
			  //TODO: Ausgabe von cap5, erg�nzen Sie die fehlenden Methodenaufrufen
			    //System.out.println("Name: " );
			    //System.out.println("Vorname: "  );
			    //System.out.println("Kapit�n seit: "  );
			    //System.out.println("Gehalt: " +   " F�derationsdukaten");
			    //System.out.println("Vollname: "  );
			    //System.out.println( + "\n"); //Die toString() Methode wird aufgerufen
			    
			}

		}