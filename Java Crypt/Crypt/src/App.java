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
     * <p> Gera um vetir de start (IV) para o modo CBC.</p>
     * 
     * @return
     */
    public static IvParameterSpec generateIv(){
        // IV usado na criptografia precisa ser o mesmo na descriptografia. Isso significa que você deve armazenar o IV gerado durante a criptografia e reutilizá-lo durante a descriptografia.
        byte[] iv = new byte[16];
        new java.security.SecureRandom().nextBytes(iv);
        return new IvParameterSpec(iv);
    }

    /**
     * <p>Gerar uma chave secreta</p>
     * 
     * @throws Exception
     * @return secrete key
     */
    public static SecretKey generateSecretKey() throws Exception{
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256); // 128 ou 192 bits
        return keyGen.generateKey();
    }

    /**
     * <p>Converte a chave secreta para String base64 para armazenar</p>
     * 
     * @param key
     * @return
     */
    public static String encodeKeyToBase64(SecretKey key){
        return Base64.getEncoder().encodeToString(key.getEncoded());
    }

    /**
     * <p>Converte a string base64 de volta para SecretKey</p>
     * 
     * @param base64key
     * @return
     */
    public static SecretKey decodeKeyFromBase64(String base64key){
        byte[] decodeKey = Base64.getDecoder().decode(base64key);
        return new SecretKeySpec(decodeKey, 0, decodeKey.length, "AES");
    }

    /**
     * <p>Criptografa o texto fornecido usando a chave secreta</p>
     * @param message
     * @param key
     * @return
     * @throws Exception
     */
    public static String encrypt(String message, SecretKey key, IvParameterSpec iv) throws Exception{
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, key, iv);
        
        byte[] encryptedBytes = cipher.doFinal(message.getBytes());
        
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    public static String decrypt(String message, SecretKey key, IvParameterSpec iv) throws Exception{
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, key, iv);
        
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(message));
        
        return new String(decryptedBytes);
    }

    /**
     * <p>Método principal da aplicação.</p>
     * 
     * @param args
     */
    public static void main(String[] args){
        try {
            SecretKey secretKey = App.generateSecretKey();
            IvParameterSpec iv = generateIv();

            // Armazenar chave e IV em formato base64
            String encodedString = App.encodeKeyToBase64(secretKey);
            System.out.println("[-] Secret key (encoded em formato base64): " + encodedString);
            
            // Restaurar chave e IV de base64
            SecretKey decodeString = App.decodeKeyFromBase64(encodedString);
            System.out.println("[-] Secret key (decoded em formato base64): " + decodeString.hashCode());

            // =====================================================

            // Criptografar uma mensagem
            String message = "Hello, world";
            String encrypetedMessage = encrypt(message, secretKey, iv);
            System.out.printf("[+] Sua mensagemm: %s \n", message);
            System.out.println("Mensagem criptografada: " + encrypetedMessage);

            // Descriptografar a mensagem
            String decryptedMessage = decrypt(encrypetedMessage, secretKey, iv);
            System.out.println("Mensagem descriptografada: " + decryptedMessage);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
