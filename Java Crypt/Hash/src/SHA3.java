import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.HexFormat;

/**
 * Classe de hash SHA3.
 */
public class SHA3 {
    /**
     * Gerar um HASH de modelo SHA3-256
     * 
     * @param input
     * @param salt
     * @return String
     * @throws NoSuchAlgorithmException
     */
    public String generateHashSHA3(String input, String salt) throws NoSuchAlgorithmException {
        String saltedInput = salt + input;

        MessageDigest digest = MessageDigest.getInstance("SHA3-256");

        byte[] hashBytes = digest.digest(saltedInput.getBytes(StandardCharsets.UTF_8));

        // Retorna o hash em formato hexadecimal
        return HexFormat.of().formatHex(hashBytes);
    }

    /**
     * Gerar um salt aleatório para guardar no banco de dados.
     * 
     * @return salt
     */
    public String generateSalt(){
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
    public void validatedPassword(String input, String currentPassword, String salt){
        try {
            String inputHash = new SHA3().generateHashSHA3(input, salt);

            System.out.println("Validate: " + inputHash.equals(currentPassword));
        } catch (NoSuchAlgorithmException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
