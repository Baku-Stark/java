public class Convert {
    public void conBin(int number){
        System.out.println("BINÁRIO : " + Integer.toBinaryString(number));
    }

    public void conOct(int number){
        System.out.println("OCTAL : " + Integer.toOctalString(number));
    }

    public void conHex(int number){
        System.out.println("HEXADECIMAL : " + Integer.toHexString(number));
    }
}
