package interfaceWorld;

public class Animal implements Action {

	private String name;
	private Date dateOfBirth;
	private String colour;
	private int age;

	public Animal(String name, int year, String colour) {
		this.name = name;
		this.dateOfBirth = new Date(year);
		this.age = this.dateOfBirth.calculateAge();
		this.colour = colour;
	}

	public Animal(String name, int year) {
		this.name = name;
		this.dateOfBirth = new Date(year);
		this.colour = "black";
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

	public String getName() {
		return name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getColour() {
		return colour;
	}

	@Override
	public String toString() {
		return "Animal \nname = " + name + "\ndateOfBirth = " + dateOfBirth + "\ncolour = " + colour + "\nage = " + age;
	}

	public int getAge() {
		return age;
	}

}
