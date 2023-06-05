public class Constructors {
    public static void main(String[] args){
        Human human = new Human("Wallace", 22, 1.75);
        Human human2 = new Human("Morty", 15, 1.70);

        System.out.println(human.name);
        human.drink();
        human2.eat();
    }
}

class Human{
    // Constructors

    String name;
    int age;
    double weight;

    Human(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat(){
        System.out.println(this.name + " is eating");
    }

    void drink(){
        System.out.println(this.name + " is drinking *burp*");
    }
}