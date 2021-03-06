/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.password.model;

import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author ASUS
 */
public class Password {

    /**
     * This function encrypts any string
     *
     * @param text
     * @return a string
     */
    public static String Encrypt(String text) {

        String secretKey = "qualityinfosolutions"; //llave para encriptar datos
        String encript = "";

        try {

            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);

            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            Cipher cipher = Cipher.getInstance("DESede");
            cipher.init(Cipher.ENCRYPT_MODE, key);

            byte[] plainTextBytes = text.getBytes("utf-8");
            byte[] buf = cipher.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.encodeBase64(buf);
            encript = new String(base64Bytes);

        } catch (Exception ex) {
        }
        return encript;

    }

    /**
     * This function decrypted any string
     * @param encrypted text
     * @return a string
     */
    public static String Decrypted(String textEncrypted) throws Exception {

        String secretKey = "qualityinfosolutions"; //llave para desenciptar datos
        String stringDecrypted = "";

        try {
            byte[] message = Base64.decodeBase64(textEncrypted.getBytes("utf-8"));
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");

            Cipher decipher = Cipher.getInstance("DESede");
            decipher.init(Cipher.DECRYPT_MODE, key);

            byte[] plainText = decipher.doFinal(message);

            stringDecrypted = new String(plainText, "UTF-8");

        } catch (Exception ex) {
        }
        return stringDecrypted;
    }
}
