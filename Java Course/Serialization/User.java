package Serialization;

import java.io.Serializable;

public class User implements Serializable{
    String name;
    transient String password;

    private static final long serialVersionUID = 1;

    public void sayHello(){
        System.out.println("Hello " + name + "!");
    }
}
