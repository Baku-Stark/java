public class String_Methods {
    public static void main(String[] args){
        String name = "Bro";

        boolean result = name.equals("Bro");
        boolean result_empty = name.isEmpty();
        int result_length = name.length();
        int result_index = name.indexOf("o");
        char result_char = name.charAt(0);
        String result_trim = name.trim();
        String result_upperCase = name.toUpperCase();
        String result_replace = name.replace('o', 'a');

        System.out.println(result);
        System.out.println(result_empty);
        System.out.println(result_length);
        System.out.println(result_index);
        System.out.println(result_char);
        System.out.println(result_trim);
        System.out.println(result_upperCase);
        System.out.println(result_replace);
    }
}
