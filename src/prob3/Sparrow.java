package prob3;

public class Sparrow implements Soundable {
	private String itsSound = "\"짹짹\"";

	@Override
	public String sound() {
		return itsSound;
	}
}
