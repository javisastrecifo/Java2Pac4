package interfaceWorld;

public class Teacher extends Person {

	private String grade;

	public Teacher(String name, String surname, int day, int month, int year, String grade) {
		super(name, surname, day, month, year);
		this.grade = grade;
	}

	public Teacher(String name, String surname, int year, String grade) {
		super(name, surname, year);
		this.grade = grade;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Teacher \nname = " + super.getName() + "\nsurname = " + super.getSurname() + "\ndateOfBirth = "
				+ super.getDateOfBirth() + "\nage = " + super.getAge() + "\ngrade = " + this.grade;
	}

}
