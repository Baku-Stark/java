# Java BCrypt

Aqui está um exemplo em Java de como usar o BCrypt para armazenamento seguro de senhas. O BCrypt é um algoritmo de hashing projetado especificamente para armazenar senhas, com suporte embutido para **salting** e **iterações** (também conhecido como "key stretching"), o que torna as senhas muito mais difíceis de serem quebradas por ataques de força bruta.


### Explicação do Código:

1. **Geração de Hash (hashPassword)**:
   - `BCrypt.hashpw(password, BCrypt.gensalt())`: Este método gera o hash da senha fornecida. O `gensalt()` gera um salt aleatório e define o número de iterações (custo), que por padrão é 10. O salt é incluído automaticamente no hash gerado.

2. **Verificação de Senha (checkPassword)**:
   - `BCrypt.checkpw(password, storedHash)`: Este método compara a senha fornecida pelo usuário com o hash armazenado no banco de dados. Ele cuida de tudo: da extração do salt do hash armazenado até a aplicação das mesmas iterações.

3. **Salt e Iterações Internas**:
   - O BCrypt inclui o salt e o número de iterações diretamente no hash, então você não precisa armazená-los separadamente.

4. **Hash Resultante**:
   - O hash gerado pelo BCrypt inclui informações sobre o algoritmo, o salt, e o número de iterações, tudo incorporado na string resultante, o que facilita a verificação posterior.

### Considerações de Segurança:

- **Custo do BCrypt**: O custo padrão de 10 é um bom equilíbrio entre segurança e desempenho. No entanto, se sua aplicação permite, aumentar o custo aumenta a segurança, tornando o processo de hash mais lento e, portanto, mais resistente a ataques de força bruta.
  
- **Armazenamento do Hash**: O hash gerado deve ser armazenado no banco de dados, e nunca a senha em texto claro.

### Exemplo de Uso:

Quando você executar este código, ele irá:

1. Gerar um hash para a senha "MySecurePassword!".
2. Verificar se a senha "MySecurePassword!" corresponde ao hash armazenado.
3. Tentar validar uma senha incorreta "WrongPassword", mostrando que não corresponde ao hash.

Isso fornece um método seguro e eficiente para armazenar e verificar senhas em aplicações Java.