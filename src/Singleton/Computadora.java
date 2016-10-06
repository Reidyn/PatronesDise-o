package Singleton;

public class Computadora {
	
	private Marcianos marcianos = Marcianos.getMarcianos();

	public Computadora() {}
	
	public void creaMarcianos(){
		marcianos.creaMarcianos();
	}
}
