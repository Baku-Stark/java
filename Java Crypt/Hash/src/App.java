import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

/**
 * Classe principal da aplicação
 */
public class App {
    /**
     * Gerar um salt aleatório para guardar no banco de dados.
     * 
     * @return salt
     */
    public static String generateSalt(){
        SecureRandom secureRandom = new SecureRandom();
        byte[] salt = new byte[16];

        secureRandom.nextBytes(salt);

        return Base64.getEncoder().encodeToString(salt);
    }

    /**
     * Validar senha com hash e salt.
     * 
     * @param input
     * @param currentPassword
     * @param salt
     */
    public static void validatedPassword(String input, String currentPassword, String salt){
        try {
            String inputHash = new SHA3().generateHashSHA3(input, salt);

            System.out.println("Validate: " + inputHash.equals(currentPassword));
        } catch (NoSuchAlgorithmException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        try {
            // ARMAZENAR O `salt` no banco de dados
            String salt = generateSalt();
            System.out.println("SALT: " + salt);

            // ARMAZENAR `hashedCurrentPassword` no banco de dados
            String currentPassword = "system123";
            String hashedCurrentPassword = new SHA3().generateHashSHA3(currentPassword, salt);
            System.out.println("SHA3-256: " + hashedCurrentPassword);

            String input = "system123";

            validatedPassword(input, hashedCurrentPassword, salt);
            
        } catch (NoSuchAlgorithmException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
