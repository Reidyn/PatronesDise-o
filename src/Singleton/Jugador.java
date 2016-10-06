package Singleton;

public class Jugador {
	private Marcianos marcianos;

	public Jugador() {
		marcianos = Marcianos.getMarcianos();
	}
	
	public void destruirMarcianos(){
		marcianos.derribaMarcianos();
	}
}
