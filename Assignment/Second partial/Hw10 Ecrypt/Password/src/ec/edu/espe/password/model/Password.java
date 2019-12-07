/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.password.model;

import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author ASUS
 */
public class Password {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String textoSinEncriptar = "sergio";
        String textoEncriptadoConSHA = DigestUtils.sha1Hex(textoSinEncriptar);
        String textoEncriptadoConMD5 = DigestUtils.md5Hex(textoSinEncriptar);
        System.out.println("Texto Encriptado con SHA : " + textoEncriptadoConSHA);
        System.out.println("Texto Encriptado con MD5 : " + textoEncriptadoConMD5);

      
    }

}
