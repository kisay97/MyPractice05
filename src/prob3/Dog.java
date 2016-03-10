package prob3;

public class Dog implements Soundable {

	private String itsSound = "\"멍멍\"";

	@Override
	public String sound() {
		return itsSound;
	}
}
