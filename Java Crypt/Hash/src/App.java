import java.security.NoSuchAlgorithmException;


/**
 * Classe principal da aplicação
 */
public class App {

    static void testHashSHA3(String currentPass, String inputPass){
        try {
            // ARMAZENAR O `salt` no banco de dados
            String salt = new SHA3().generateSalt();
            System.out.println("SALT: " + salt);

            // ARMAZENAR `hashedCurrentPassword` no banco de dados
            String hashedCurrentPassword = new SHA3().generateHashSHA3(currentPass, salt);
            System.out.println("SHA3-256: " + hashedCurrentPassword);

            

            new SHA3().validatedPassword(inputPass, hashedCurrentPassword, salt);
            
        } catch (NoSuchAlgorithmException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    static void testHashBycrypt(String currentPass, String inputPass){
       
    }
    
    public static void main(String[] args){
        // SENHA SALVA NO BANCO DE DADOS
        String currentPassword = "system123";

        // TENTATIVA DE RECEBIMENTO DE SENHA
        String input = "system123";

        //testHashSHA3(currentPassword, input);
        testHashBycrypt(currentPassword, input);
    }
}
