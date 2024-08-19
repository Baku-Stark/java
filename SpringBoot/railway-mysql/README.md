# Spring Boot Railway + MySQL

- [Spring Initializr](https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.3.2&packaging=jar&jvmVersion=22&groupId=com.spring&artifactId=railway-mysql&name=railway-mysql&description=Estudo%20para%20banco%20de%20dados%20com%20Java%20e%20MySQL&packageName=com.spring.railway-mysql&dependencies=web,data-jpa,mysql)

Integrar **Spring Boot** com **Railway** e **MySQL** envolve alguns passos que cobrem a criação de um projeto Spring Boot, a configuração do banco de dados MySQL no Railway, e a conexão do seu projeto com esse banco. Vou guiar você pelos passos principais:

### 1. Criar um Projeto Spring Boot

Primeiro, você pode usar o **Spring Initializr** (como na imagem anterior) para criar um novo projeto Spring Boot:

- **Project**: Maven
- **Language**: Java
- **Spring Boot**: A versão mais recente estável (3.3.2)
- **Group**: por exemplo, `com.example`
- **Artifact**: por exemplo, `railway-demo`
- **Dependencies**:
  - **Spring Web** (para criar APIs)
  - **Spring Data JPA** (para integração com o banco de dados)
  - **MySQL Driver** (para conexão com o MySQL)

Baixe o projeto gerado e descompacte-o em sua máquina.

### 2. Configurar o Banco de Dados MySQL no Railway

**Railway** é uma plataforma de deploy que também fornece bancos de dados gerenciados. Para configurar o MySQL:

1. Crie uma conta e entre em [Railway.app](https://railway.app/).
2. Crie um novo projeto e escolha “Provision” para adicionar um novo serviço de banco de dados MySQL.
3. Uma vez provisionado, você verá as credenciais do banco de dados (host, database, user, password, port).

### 3. Configurar a Conexão com o Banco de Dados no Spring Boot

Com as credenciais do MySQL em mãos, você precisa configurar seu projeto Spring Boot para se conectar ao banco de dados:

1. No arquivo `application.properties` (ou `application.yml`), adicione as seguintes propriedades:

   ```properties
   spring.datasource.url=jdbc:mysql://<HOST>:<PORT>/<DATABASE>
   spring.datasource.username=<USERNAME>
   spring.datasource.password=<PASSWORD>
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
   ```

   Substitua `<HOST>`, `<PORT>`, `<DATABASE>`, `<USERNAME>`, e `<PASSWORD>` pelos valores obtidos no Railway.

2. Opcionalmente, você pode configurar variáveis de ambiente no Railway para armazenar essas informações sensíveis de forma segura. No Railway, adicione as variáveis de ambiente correspondentes e, no `application.properties`, referencie essas variáveis:

   ```properties
   spring.datasource.url=${MYSQL_URL}
   spring.datasource.username=${MYSQL_USER}
   spring.datasource.password=${MYSQL_PASSWORD}
   ```

### 4. Criar Entidades e Repositórios

Com a conexão configurada, você pode criar suas entidades e repositórios JPA:

1. **Entidade Exemplo**:

   ```java
   @Entity
   public class User {
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long id;

       private String name;
       private String email;

       // getters and setters
   }
   ```

2. **Repositório Exemplo**:

   ```java
   public interface UserRepository extends JpaRepository<User, Long> {
   }
   ```

### 5. Deploy no Railway

Agora, para fazer o deploy do seu projeto Spring Boot no Railway:

1. Suba o código para um repositório no GitHub.
2. No Railway, adicione um novo projeto e conecte ao seu repositório GitHub.
3. Configure o build para Maven, como:

   ```bash
   mvn clean install -DskipTests
   ```

4. Railway vai automaticamente criar o build e fazer o deploy do seu projeto. Ele também cuidará de criar e conectar as variáveis de ambiente que você configurou.

### 6. Testar a Aplicação

Depois de tudo configurado, você pode acessar o URL gerado pelo Railway para testar suas APIs e a conexão com o banco de dados MySQL.

Isso deve cobrir todo o processo de integração do Spring Boot com Railway e MySQL. Se precisar de mais detalhes em algum passo específico, é só me avisar!

----

# Swagger Configuration with Spring Boot 3 | Swagger + Spring Boot 3

- [Youtbube Video](https://www.youtube.com/watch?v=Eo6v01KUeZM&list=PLMv2LIvrQ6a-wQFhwWW-HucCOyTOUmBoZ&index=9)

## Swagger Dependency

```xml
<!--Swagger-->
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.0.2</version>
</dependency>
```

## URL Swagger html

```txt
http://localhost:8080/swagger-ui/index.html
```