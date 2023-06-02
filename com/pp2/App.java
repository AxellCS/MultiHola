package com.pp2;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestTh t1,t2,t3;

        // Creacion de los Threads
		//Numero aleatorio por 2000 microsegundos
        t1 = new TestTh( "Thread 1",(int)(Math.random()*2000) );
        t2 = new TestTh( "Thread 2",(int)(Math.random()*2000) );
        t3 = new TestTh( "Thread 3",(int)(Math.random()*2000) );

        // Ejecucion de los threads
        t1.start();
        t2.start();
        t3.start();
        }	

}
