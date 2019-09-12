package interfaceWorld;

public class Cat extends Animal {

	private int numberOfLifes;

	public Cat(String name, int year, String colour, int lifes) {
		super(name, year, colour);
		this.numberOfLifes = lifes;
	}

	public Cat(String name, int year, int lifes) {
		super(name, year);
		this.numberOfLifes = lifes;
	}

	public int getNumberOfLifes() {
		return numberOfLifes;
	}

	@Override
	public String toString() {
		return "Cat \nname = " + super.getName() + "\ndateOfBirth = " + super.getDateOfBirth() + "\ncolour = "
				+ super.getColour() + "\nage = " + super.getAge() + "\nnumber of lifes = " + numberOfLifes;
	}

}
