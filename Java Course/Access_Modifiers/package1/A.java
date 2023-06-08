package Access_Modifiers.package1;
import Access_Modifiers.package2.*;

public class A {
    protected String protectedMessage = "This is protected --- A";

    public static void main(String[] args) {
        C c = new C();
        B b = new B();

        System.out.println(c.publicMessage);
        System.out.println(b.privateMessage);
    }
}
