
public class Captain {

	private String name;
	private String surname;
	private int captainYears;
	private double Salary;

	// TODO: 3. Fuegen Sie in der Klasse 'Captain' das Attribut 'name' hinzu und
	// implementieren Sie die entsprechenden get- und set-Methoden.
	// TODO: 4. Implementieren Sie einen Konstruktor, der den Namen und den Vornamen
	// initialisiert.
	// TODO: 5. Implementieren Sie einen Konstruktor, der alle Attribute
	// initialisiert.

	public Captain (String name, String surname){
		this.surname=surname;
		this.name=name;
	}

	public captain (String name, String surname, int captainYears, double Salary){
		this(name,surname);
		//this.name=name;
		//this.surname=surname;
		this.captainYears=captainYears;
		this.Salary=Salary;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getName(){
		return this.name;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSalary(double Salary) {
		// TODO: 1. Implementieren Sie die entsprechende set-Methode.
		// Ber�cksichtigen Sie, dass das Gehalt nicht negativ sein darf.
		if Salary > 0 
		this.Salary = Salary;
	}

	public double getSalary() {
		// TODO: 2. Implementieren Sie die entsprechende get-Methoden.
		return this.Salary;
	}

	public void setcaptainYears(int captainYears) {
		this.captainYears = captainYears;
	}

	public int getcaptainYears() {
		return this.captainYears;
	}
	// TODO: 6. Implementieren Sie die set-Methode und die get-Methode f�r
	// captainYears.
	// Ber�cksichtigen Sie, dass das Jahr nach Christus sein soll.

	// TODO: 7. Implementieren Sie eine Methode 'vollname', die den vollen Namen
	// (Vor- und Nachname) als string zur�ckgibt.
}