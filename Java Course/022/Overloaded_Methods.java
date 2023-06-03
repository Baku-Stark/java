public class Overloaded_Methods {
    public static void main(String[] args){
        double x = add(1.0, 2.0, 3.0, 4.0);
        System.out.println(x);
    }

    static double add(double a, double b){
        System.out.println("This is overloaded method #1");
        return a + b;
    }

    static double add(double a, double b, double c){
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }

    static double add(double a, double b, double c, double d){
        System.out.println("This is overloaded method #3");
        return a + b + c + d;
    }

}
