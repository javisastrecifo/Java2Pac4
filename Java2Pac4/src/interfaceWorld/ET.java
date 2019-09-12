package interfaceWorld;

public class ET extends Alien {

	private boolean isMortal;

	public ET(String name, int year, boolean isMort) {
		super(name, year);
		this.isMortal = isMort;
	}

	public boolean isMortal() {
		return isMortal;
	}

	@Override
	public String toString() {
		return "ET \nname = " + super.getName() + "\ndateOfBirth = " + super.getDateOfBirth() + "\ncolour = "
				+ super.getColour() + "\nage = " + super.getAge() + "\nIs Mortal? = " + isMortal;
	}
}
