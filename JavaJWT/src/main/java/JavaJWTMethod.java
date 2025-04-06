import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Date;

public class JavaJWTMethod {
    private static Algorithm algorithm;
    private static String token;

    public static void createToken(){
        try {
            // 1. Gerar par de chaves RSA (em produção, você usaria chaves pré-geradas)
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            KeyPair keyPair = keyPairGenerator.generateKeyPair();

            RSAPublicKey rsaPublicKey = (RSAPublicKey) keyPair.getPublic();
            RSAPrivateKey rsaPrivateKey = (RSAPrivateKey) keyPair.getPrivate();

            // 2. Criar algoritmo de assinatura
            algorithm = Algorithm.RSA256(rsaPublicKey, rsaPrivateKey);

            // 3. Criar o token JWT
            token = JWT.create()
                    .withIssuer("auth0")
                    .withSubject("user123")  // normalmente o ID do usuário
                    .withAudience("your-audience")  // quem deve aceitar este token
                    .withExpiresAt(new Date(System.currentTimeMillis() + 7200000))  // expira em 2 hora
                    .sign(algorithm);

            System.out.println("Token gerado: " + token);

        } catch (JWTCreationException exception) {
            exception.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void verifyToken(){
        // Criar verifier com a chave pública
        JWTVerifier verifier = JWT.require(algorithm)
                .withIssuer("auth0")
                .withAudience("your-audience")
                .build();

        // Verificar o token
        DecodedJWT decodedJWT = verifier.verify(token);

        System.out.println("Token válido!");
        System.out.println("Subject: " + decodedJWT.getSubject());
        System.out.println("Expira em: " + decodedJWT.getExpiresAt());
    }

    public static DecodedJWT decodeToken() {
        return JWT.decode(token);
    }
}
