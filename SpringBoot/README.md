# Spring Boot

Spring Boot é um framework open-source baseado no Spring Framework que simplifica a criação de aplicações Java, especialmente aplicações web e microservices. Ele fornece uma maneira rápida e fácil de configurar, desenvolver e implantar aplicações, removendo grande parte da complexidade associada ao uso do Spring Framework tradicional.

### Principais Características do Spring Boot:

1. **Configuração Simplificada**:
   - Spring Boot elimina a necessidade de configurar manualmente muitos aspectos da aplicação, como configuração de banco de dados, segurança e servidor web. Ele fornece configurações automáticas (autoconfiguração) baseadas nos componentes disponíveis no classpath.

2. **Aplicações Independentes**:
   - Permite criar aplicações que podem ser executadas como um JAR independente com um servidor web embutido (por exemplo, Tomcat, Jetty), sem a necessidade de implantar em um servidor externo.

3. **Starter POMs**:
   - Oferece "starters", que são dependências predefinidas para diferentes funcionalidades, como `spring-boot-starter-web` para aplicações web, `spring-boot-starter-data-jpa` para integração com banco de dados usando JPA, entre outros. Isso facilita a inclusão das dependências necessárias no projeto.

4. **Mecanismo de Configuração Externa**:
   - Suporta várias formas de configuração externa (arquivos de configuração, variáveis de ambiente, argumentos de linha de comando), permitindo a personalização das aplicações sem alterar o código-fonte.

5. **Monitoramento e Gerenciamento**:
   - Inclui um módulo de monitoramento e gerenciamento, o Spring Boot Actuator, que oferece endpoints para monitorar e gerenciar a aplicação durante sua execução.

6. **Integração com Ferramentas e Frameworks Populares**:
   - Spring Boot se integra facilmente com outras ferramentas e frameworks populares, como Hibernate, Thymeleaf, Kafka, entre outros.

### Para que Serve o Spring Boot?
- **Desenvolvimento de Aplicações Web**: Simplifica a criação de APIs RESTful e aplicações web.
- **Criação de Microservices**: Muito utilizado para a criação de microservices devido à sua leveza e facilidade de configuração.
- **Protótipos Rápidos**: Ideal para criar protótipos rapidamente, sem precisar configurar manualmente muitos aspectos da aplicação.
- **Aplicações Empresariais**: Pode ser utilizado para desenvolver aplicações empresariais escaláveis e robustas.

### Como e Onde Usar?
- Spring Boot é usado em projetos onde a simplicidade, velocidade de desenvolvimento e facilidade de manutenção são importantes. É especialmente popular em ambientes ágeis, onde se busca uma rápida entrega de valor e onde há necessidade de integrar facilmente com outras ferramentas e tecnologias.

Se você estiver interessado em aprender mais ou começar a usar Spring Boot, pode acessar o site oficial [Spring Boot](https://spring.io/projects/spring-boot) para documentação, tutoriais e exemplos.

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
