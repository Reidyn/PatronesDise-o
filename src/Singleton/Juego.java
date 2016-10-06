package Singleton;

import java.util.Scanner;

public class Juego {
	
	private static Marcianos marcianos;
	private static Computadora computadora;
	private static Jugador jugador;
	private static Scanner sc;
	
	public static void main(String[] args) {
		marcianos = Marcianos.getMarcianos();
		computadora = new Computadora();
		jugador = new Jugador();
		
		sc = new Scanner(System.in);
		
		int disparos = 0;
		
		do{
			System.out.println("Ingrese cantidad de disparos :");
			disparos = sc.nextInt();
			for(int i=0;i<disparos;i++){
				jugador.destruirMarcianos();
			}
			computadora.creaMarcianos();
		}while(disparos!=0);
	}

}
