import hashes.SHA3;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("SHA3-256: " + new SHA3().generateHashSHA3("Hello, world"));
    }
}
