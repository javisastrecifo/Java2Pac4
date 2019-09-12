package interfaceWorld;

public class Main {

	public static void main(String[] args) {

		Teacher albert = new Teacher ("Albert", "Yarza", 1423, "Java");
		Student roger = new Student ("Roger", "Sobrino", 1982, 1);
		Person josep = new Person ("Josep", "Lambies", 1987);
		Person claus = new Student ("Claus", "Mullie", 1989, 3);
		
		
		Cat maula = new Cat ("Maula", 2013, 7);
		Animal bruna = new Cat ("Bruna", 2011, 6);
		Dog soci = new Dog ("Soci", 2010, true);
		Animal rick = new Animal ("Rick, the parrot", 2017, "roig");
		
		ET et = new ET ("ET", -1000, true);
		Alien et2 = new ET ("ET 2", -500, true);
		Superman charles = new Superman ("Charles", 1000);
		Alien alien = new Alien ("Alien", 1200, "yellow");
		
		System.out.println(albert);
		System.out.println("-");
		System.out.println(roger);
		System.out.println("-");
		System.out.println(josep);
		System.out.println("-");
		System.out.println(claus);
		System.out.println("-");
		System.out.println(maula);
		System.out.println("-");
		System.out.println(bruna);
		System.out.println("-");
		System.out.println(soci);
		System.out.println("-");
		System.out.println(rick);
		System.out.println("-");
		System.out.println(et);
		System.out.println("-");
		System.out.println(et2);
		System.out.println("-");
		System.out.println(charles);
		System.out.println("-");
		System.out.println(alien);
		

	}

}
