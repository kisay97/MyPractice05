package prob3;

public class Duck implements Soundable {
	private String itsSound = "\"꽥꽥\"";

	@Override
	public String sound() {
		return itsSound;
	}
}
