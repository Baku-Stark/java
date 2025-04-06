public class Main {
    public static void main(String[] args) {
        JavaJWTMethod.createToken();

        System.out.println("=====");
        JavaJWTMethod.verifyToken();

        System.out.println("=====");
        System.out.println("Token Decode: " + JavaJWTMethod.decodeToken());
    }
}