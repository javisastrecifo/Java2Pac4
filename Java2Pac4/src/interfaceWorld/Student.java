package interfaceWorld;

public class Student extends Person {

	private int course;

	public Student(String name, String surname, int day, int month, int year, int course) {
		super(name, surname, day, month, year);
		this.course = course;
	}
	
	public Student(String name, String surname, int year, int course) {
		super(name, surname, year);
		this.course = course;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student \nname = " + super.getName() + "\nsurname = " + super.getSurname() + "\ndateOfBirth = "
				+ super.getDateOfBirth() + "\nage = " + super.getAge() + "\ncourse = " + this.course;
	}

}
