package com.pp2;

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
			System.out.println("Hilo Finalizado");
		}

		System.out.println( "Hola Mundo! "+nombre+" "+retardo );
	}
}
