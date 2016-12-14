package no11;

public class ArguPolyTest {
	public static void main(String[] args) {
		Person[] persons = new Person[2];
		persons[0] = new Dancer();
		persons[1] = new Actor();
		for (int i = 0; i < persons.length; i++) {
			persons[i].play();
			persons[i].display();
		}
	}
}

abstract class Person {
	String str;

	abstract void play();

	void display() {
		System.out.println(str);
	}
}

class Dancer extends Person {
	@Override
	protected void play() {
		str = "ÃãÃá´Ù";
	}
}

class Actor extends Person {
	@Override
	protected void play() {
		str = "¿¬±âÇÑ´Ù";
	}
}