/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antSimulato.controller;

/**
 *
 * @author Labs-DCCO
 */
public class AntEater {
String comensal = ("hormigas" + " insectos" + " migas");
	private Cell position;
	private int antEaterCounter;
	private int runCounter;
        private state Enum;
                
                

	public void Run() {
		// TODO - implement AntEater.Run
		          System.out.println("El comensal de la hormiga es: " + comensal );
	}
 public enum state{
    hojas, migas, insectos
}
}