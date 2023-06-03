import java.util.Scanner;

public class MathClass {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double x = 3.14;
        double y = -10;

        double num_maior = Math.max(x, y);

        double num_menor = Math.min(x, y);

        System.out.println("O maior número é: "+num_maior);
        System.out.println("O menor número é: "+num_menor);
        System.out.println("-------------------------------");
        System.out.println("Enter height: ");
        double altura = scanner.nextDouble();
        System.out.println('\n');

        System.out.println("Enter width: ");
        double largura = scanner.nextDouble();
        System.out.println('\n');
        
        double res = Math.sqrt((altura * altura) + (largura * largura));

        System.out.println("O resultado: "+res);

        scanner.close();
    }
}
