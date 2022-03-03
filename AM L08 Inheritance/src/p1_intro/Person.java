package p1_intro;

public abstract class Person {
	private Name name;
	private String id;
	private static int idCount = 0;

	public Person(Name name) {
		super();
		this.name = name;
		id = String.valueOf(idCount++);
	}

	public Name getName() { // protected: access to subclasses only
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}

}
