import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HexFormat;

/**
 * Classe de hash SHA3.
 */
public class SHA3 {
    public String generateHashSHA3(String input, String salt) throws NoSuchAlgorithmException {
        String saltedInput = salt + input;

        MessageDigest digest = MessageDigest.getInstance("SHA3-256");

        byte[] hashBytes = digest.digest(saltedInput.getBytes(StandardCharsets.UTF_8));

        // Retorna o hash em formato hexadecimal
        return HexFormat.of().formatHex(hashBytes);
    }
}
