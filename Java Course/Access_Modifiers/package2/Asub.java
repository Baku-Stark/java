package Access_Modifiers.package2;
import Access_Modifiers.package1.*;

public class Asub extends A {
    public static void main(String[] args) {
        C c = new C();
        Asub asub = new Asub();

        System.out.println(c.protectedMessage);
        System.out.println(asub.protectedMessage);
    }
}
