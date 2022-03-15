package p1;

public class Student {
	private String name;
	private Playable playable;
	
	public Student(String name, Playable playable) {
		this.name = name;
		this.playable = playable;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void playSports() {
		playable.play();
	}
	
//	public void readBooks() {
//		playable.read();
//	}

}
