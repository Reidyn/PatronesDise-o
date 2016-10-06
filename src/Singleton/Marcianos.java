package Singleton;

public class Marcianos {
	
	private static final Marcianos marcianos = new Marcianos();
	private static int cantidad;
	
	private Marcianos(){
		this.cantidad = 10;
		
	}
	
	public static Marcianos getMarcianos(){
		return marcianos;
	}
	
	public static void derribaMarcianos(){
		System.out.println("Marciano Derribado");
		if(cantidad>0){
			cantidad--;
		}
	}
	
	public static void creaMarcianos(){
		System.out.println("Marciano Creado");
		if(cantidad>0){
			cantidad++;
		}
	}
	
	public static void cuantosQuedas(){
		if(cantidad>0){
			System.out.println("Quedan :"+cantidad+" marcianos");
		}else{
			System.out.println("Juego Terminada");
		}
	}
}
