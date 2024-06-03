package D0409.p59;

public class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int compareTo(Person arg0) {
		if (age < arg0.age)
			return -1;
		else if (age == arg0.age)
			return 0;
		else
			return -1;

	}

	public void print() {
		System.out.println(name + " " + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
