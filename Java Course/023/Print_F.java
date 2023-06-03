public class Print_F {
    public static void main(String[] args){
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        System.out.printf("#1: %b", myBoolean);
        System.out.printf("#2: %c", myChar);
        System.out.printf("#3: %s", myString);
        System.out.printf("#4: %d", myInt);
        System.out.printf("#5: %f", myDouble);

        // printf com espaços [Utilizados em texto]
        System.out.printf("Hello %10s", myString);

        // printf com contagem de números após a vírgula [Utilizados em resultado de capital]
        System.out.printf("You have this much money %.2f", myDouble);
    }
}
