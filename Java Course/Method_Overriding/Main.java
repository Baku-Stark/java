package Method_Overriding;

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog();

        dog.speak();
    }
}

class Animal{
    void speak(){
        System.out.println("The animal speaks");
    }
}

class Dog extends Animal{
    @Override
    void speak(){
        System.out.println("The dog goes *bark*");
    }
}