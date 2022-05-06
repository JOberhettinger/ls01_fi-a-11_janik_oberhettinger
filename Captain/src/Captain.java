
public class Captain {

	private String surname;
	private int captainYears;
	private double gehalt;
	// TODO: 3. Fuegen Sie in der Klasse 'Captain' das Attribut 'name' hinzu und
	// implementieren Sie die entsprechenden get- und set-Methoden.
	// TODO: 4. Implementieren Sie einen Konstruktor, der den Namen und den Vornamen
	// initialisiert.
	// TODO: 5. Implementieren Sie einen Konstruktor, der alle Attribute
	// initialisiert.


	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSalary(double gehalt) {
		// TODO: 1. Implementieren Sie die entsprechende set-Methode.
		// Berücksichtigen Sie, dass das Gehalt nicht negativ sein darf.
		this.gehalt = gehalt;

	}

	public double getSalary() {
		// TODO: 2. Implementieren Sie die entsprechende get-Methoden.
		return 0.0;
	}
	// TODO: 6. Implementieren Sie die set-Methode und die get-Methode für
	// captainYears.
	// Berücksichtigen Sie, dass das Jahr nach Christus sein soll.

	// TODO: 7. Implementieren Sie eine Methode 'vollname', die den vollen Namen
	// (Vor- und Nachname) als string zurückgibt.
}