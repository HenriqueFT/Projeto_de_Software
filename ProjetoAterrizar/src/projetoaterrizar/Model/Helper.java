package projetoaterrizar.Model;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import projetoaterrizar.Control.Control;
public class Helper {
    
        public static String makeHash(String senha){

            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(senha.getBytes());
                String encryptedString = new String(messageDigest.digest());
                return encryptedString;
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
            }

            return null;
        }
}
