public class Methods {
    public static void main(String[] args){
        hello();
        hello_user("Wallace");
        age_user(22);

        int x = 5;
        int y = 5;
        System.out.println(x + " + "  + y + " = " + add(x, y));
    }

    static void hello(){
        System.out.println("Hello!");
    }

    static void hello_user(String user){
        System.out.println("Hello, " + user + "!");
    }

    static void age_user(int age){
        System.out.println("You're " + age + " old");
    }

    static int add(int x, int y){
        return x + y;
    }
}
