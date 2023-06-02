package com.pp2;

//Herencia de la clase Thread
//Usando un ejemplo de multiHola
//Creacion de la la clase TestTh heredando de la clase Thread
public class TestTh extends Thread {
	private String nombre;
	private int retardo;

	//Constructor de TestTh
	public TestTh( String s,int d ) {
		nombre = s;
		retardo = d;
	}

	public void run() {
		// Retardo de la ejecucion
		try {
			sleep( retardo );
		} catch( InterruptedException e ) {
			//Mensaje del hilo finalizado
			System.out.println("Hilo Finalizado");
		}
		
		//Mensaje de Hola Mundo!
		System.out.println( "Hola Mundo! "+nombre+" "+retardo );
	}
}
