package interfaceWorld;

public class Dog extends Animal {

	private boolean isVaccinated;

	public Dog(String name, int year, String colour, boolean isVac) {
		super(name, year, colour);
		this.isVaccinated = isVac;
	}

	public Dog(String name, int year, boolean isVac) {
		super(name, year);
		this.isVaccinated = isVac;
	}

	public boolean isVaccinated() {
		return isVaccinated;
	}

	@Override
	public String toString() {
		return "Cat \nname = " + super.getName() + "\ndateOfBirth = " + super.getDateOfBirth() + "\ncolour = "
				+ super.getColour() + "\nage = " + super.getAge() + "\nis vaccinated? = " + this.isVaccinated;
	}
}
