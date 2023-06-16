package Serialization;

import java.io.*;

public class DeSerial {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        User user = null;

       FileInputStream fileIn = new FileInputStream("UserInfo.ser");
       ObjectInputStream in  = new ObjectInputStream(fileIn);

       user = (User) in.readObject();
       in.close();
       fileIn.close();

       System.out.println(user.name);
       System.out.println(user.password);
       user.sayHello();
    }
}

class User implements Serializable{
    String name;
    String password;

    public void sayHello(){
        System.out.println("Hello " + name + "!");
    }
}
