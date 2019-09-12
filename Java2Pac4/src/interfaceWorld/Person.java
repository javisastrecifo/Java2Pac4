package interfaceWorld;

public class Person implements Action, HumanAction {
	private String name;
	private String surname;
	private Date dateOfBirth;
	private int age;

	public Person(String name, String surname, int day, int month, int year) {
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = new Date(day, month, year);
		this.age = this.dateOfBirth.calculateAge();
	}

	public Person(String name, String surname, int year) {
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = new Date(year);
		this.age = this.dateOfBirth.calculateAge();
	}

	public void listen() {
		System.out.println("Now listenning");
	}

	public void eat() {
		System.out.println("Now eating");
	}

	public void sleep() {
		System.out.println("Now sleeping zzzz");
	}

	public void talk() {
		System.out.println("Now talking");
	}

	public void createPrograms() {
		System.out.println("Now coding a new program");
	}

	public void study() {
		System.out.println("Now studying Java");
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person \nname = " + name + "\nsurname = " + surname + "\ndateOfBirth = " + dateOfBirth + "\nage = "
				+ age;
	}

}
