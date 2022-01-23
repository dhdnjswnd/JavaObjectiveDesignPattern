package chapter1;

public class Person_p26 {
	private Phone_p26[] phones;

	public Person_p26() {
		phones = new Phone_p26[2];
	}

	public Phone_p26 getPhone(int i) {
		if (i == 0 || i == 1)
			return phones[i];
		return null;
	}

}
