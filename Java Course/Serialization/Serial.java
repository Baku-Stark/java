package Serialization;

import java.io.*;

public class Serial {
    public static void main(String[] args) throws IOException {
        User user = new User();

        user.name = "Wallace";
        user.password = "I<3Pizza";

       FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
       ObjectOutputStream out  = new ObjectOutputStream(fileOut);

       out.writeObject(user);
       out.close();
       fileOut.close();

       System.out.println("Object info saved!");
       
       long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
       System.out.println(serialVersionUID);
    }
}
