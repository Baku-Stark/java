public class Variables{
	public static void main(String[] args) {
      // Números inteiro [-2 bi até 2 bi]
      int x = 123; // (4 bytes)
      // ---> VALORES LONGOS [- 9 quintilhões até 9 quintilhões]
      long x_2 = 100000000; // (8 bytes)
      System.out.println("My numbers are: " + x + " | "+ x_2);

      // Números flutuantes [Até 15 números pós vírgula]
      double y = 3.14;
      System.out.println("BOOLEAN: " + y);

      // Valores boleanos
      boolean z = true;
      System.out.println("BOOLEAN value: " + z);

      // Caracteres especiais
      char symbol = '@';

      // Bytes [-128 até 127]
      byte bytes = 4;

      // Strings
      String name = "Wallace";
      System.out.println("HELLO " + name);
   }
}