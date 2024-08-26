import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

/**
 * <h1>App Crypt - Base64</h1>
 * 
 * Projeto Java para decriptação e encriptação de mensagens.
 */
public class App {
    /**
     * Gerar uma chave secreta
     * 
     * @throws Exception
     * @return secrete key
     */
    public static SecretKey generateSecretKey() throws Exception{
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256); // 128 ou 192 bits
        return keyGen.generateKey();
    }

    public static String encodeKeyToBase64(SecretKey key){
        return Base64.getEncoder().encodeToString(key.getEncoded());
    }

    public static SecretKey decodeKeyFromBase64(String base64key){
        byte[] decodeKey = Base64.getDecoder().decode(base64key);
        return new SecretKeySpec(decodeKey, 0, decodeKey.length, "AES");
    }

    /**
     * Método principal da aplicação.
     * 
     * @param args
     */
    public static void main(String[] args){
        try {
            SecretKey secretKey = App.generateSecretKey();
            String encodedString = App.encodeKeyToBase64(secretKey);
            SecretKey decodeString = App.decodeKeyFromBase64(encodedString);

            System.out.println("[-] Secret key (encoded): " + encodedString);
            System.out.println("[-] Secret key (decoded): " + decodeString.hashCode());
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
