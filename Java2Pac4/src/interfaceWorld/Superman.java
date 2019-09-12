package interfaceWorld;

public class Superman extends Alien {

	private String eyeColour;

	public Superman(String name, int year) {
		super(name, year);
		this.eyeColour = "blue";
	}

	public String getEyeColour() {
		return eyeColour;
	}

	@Override
	public String toString() {
		return "Superman \nname = " + super.getName() + "\ndateOfBirth = " + super.getDateOfBirth() + "\ncolour = "
				+ super.getColour() + "\nage = " + super.getAge() + "\neyeColour = " + eyeColour;
	}

}
