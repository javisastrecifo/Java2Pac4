package interfaceWorld;

public class Alien implements AlienAction, Action, HumanAction {

	private String name;
	private Date dateOfBirth;
	private String colour;
	private int age;

	public Alien(String name, int year, String colour) {
		this.name = name;
		this.dateOfBirth = new Date(year);
		this.age = this.dateOfBirth.calculateAge();
		this.colour = colour;
	}

	public int getAge() {
		return age;
	}

	public Alien(String name, int year) {
		this.name = name;
		this.dateOfBirth = new Date(year);
		this.colour = "green";
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
	
	public void telepathy (){
		System.out.println("I'm talking to you through my brain...");
	}
	
	public void fly (){
		System.out.println("It is flying");
	}
	
	public void eatHumans() {
		System.out.println("You are my next meal, human!");
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
		return "Alien \nname = " + name + "\ndateOfBirth = " + dateOfBirth + "\nage = " + age + "\ncolour = " + this.colour;
	}

}
