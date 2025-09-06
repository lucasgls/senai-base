import org.example.card1.Calculadora;

import java.util.Scanner;

public class TestCalculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1, num2;
        int menu = 29812983;


        while(menu != 0) {
            System.out.println("===== CALCULADORA =====");
            System.out.println("Digite 1 para somar");
            System.out.println("Digite 2 para subtrair");
            System.out.println("Digite 3 para multiplicar");
            System.out.println("Digite 4 para dividor");
            System.out.println("Digite 0 para SAIR");
            System.out.printf("======================");
            menu = scan.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("\n\n\n\n\nSoma");
                    System.out.println("---------------");

                    System.out.println("Digite o numero 1: ");
                    num1 = scan.nextDouble();

                    System.out.println("Digite o numero2: ");
                    num2 = scan.nextDouble();

                    System.out.println(Calculadora.soma(num1, num2));
                    break;
                case 2:
                    System.out.println("\n\n\n\n\nSubtração");
                    System.out.println("---------------");

                    System.out.println("Digite o numero 1: ");
                    num1 = scan.nextDouble();

                    System.out.println("Digite o numero2: ");
                    num2 = scan.nextDouble();

                    System.out.println(Calculadora.subtrai(num1, num2));
                    break;
                case 3:
                    System.out.println("\n\n\n\n\nMultiplicação");
                    System.out.println("---------------");

                    System.out.println("Digite o numero 1: ");
                    num1 = scan.nextDouble();

                    System.out.println("Digite o numero2: ");
                    num2 = scan.nextDouble();

                    System.out.println(Calculadora.multiplica(num1, num2));
                    break;
                case 4:
                    System.out.println("\n\n\n\n\nDivisão");
                    System.out.println("---------------");

                    System.out.println("Digite o numero 1: ");
                    num1 = scan.nextDouble();

                    System.out.println("Digite o numero2: ");
                    num2 = scan.nextDouble();

                    System.out.println(Calculadora.divide(num1, num2));
                    break;
                case 0:
                    System.out.println("\n\nEncerrando...");
                    break;
            }
        }
    }
}
