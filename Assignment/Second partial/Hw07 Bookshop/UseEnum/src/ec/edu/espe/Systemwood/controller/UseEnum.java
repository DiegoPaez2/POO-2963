/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Systemwood.controller;

import ec.edu.espe.Systemwood.controller.TipodeMadera.TipoDeMadera;

/**
 *
 * @author ASUS
 */
public class UseEnum {

    /**
     * @param Args
     */
    public static void main(String[] Args) {

        TipoDeMadera maderaUsuario1 = TipoDeMadera.ROBLE;
        System.out.println("La madera elegida por el usuario es " + maderaUsuario1.toString() + "\ncon un color "
                + maderaUsuario1.getColor() + " y con un peso específico de " + maderaUsuario1.getPesoEspecifico() + " kg/m3");

        for (TipoDeMadera tmp : TipoDeMadera.values()) {
            System.out.println(tmp.toString() + " el palet pesa " + (2.27f * (float) tmp.getPesoEspecifico()) + " kg");

        }

    }
}
