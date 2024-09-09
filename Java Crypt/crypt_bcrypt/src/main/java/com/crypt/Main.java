package com.crypt;

import org.springframework.security.crypto.bcrypt.BCrypt;;;

public class Main {
    /**
     * Gera o hash de uma senha usando o BCrypt.
     * 
     * @param password A senha a ser hashada.
     * @return O hash gerado para a senha.
     */
    public static String hashPassword(String password) {
        // Gera o hash da senha com um salt interno e um custo padrão de 10 iterações
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    /**
     * Verifica se a senha fornecida corresponde ao hash armazenado.
     * 
     * @param password A senha fornecida pelo usuário.
     * @param storedHash O hash armazenado no banco de dados.
     * @return true se a senha corresponder ao hash, false caso contrário.
     */
    public static boolean checkPassword(String password, String storedHash) {
        // Verifica se a senha corresponde ao hash
        return BCrypt.checkpw(password, storedHash);
    }

    public static void main(String[] args) {
        // Exemplo de uso do BCrypt para armazenamento e verificação de senhas

        // Senha do usuário
        String password = "MySecurePassword!";

        // Hash da senha para armazenamento
        String hashedPassword = hashPassword(password);
        System.out.println("Hashed Password: " + hashedPassword);

        // Simulação de login: verificar se a senha fornecida corresponde ao hash armazenado
        boolean isPasswordCorrect = checkPassword("MySecurePassword!", hashedPassword);
        System.out.println("Password is correct: " + isPasswordCorrect);

        // Tentativa de login com senha incorreta
        boolean isWrongPasswordCorrect = checkPassword("WrongPassword", hashedPassword);
        System.out.println("Password is correct: " + isWrongPasswordCorrect);
    }
}