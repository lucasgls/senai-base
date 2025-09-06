import org.example.card2.Primo;

import java.util.Scanner;

public class TestPrimos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite um numero inteiro");
        int valor = scan.nextInt();

        if(Primo.checaPrimo(valor)){
            System.out.println("O numero " + valor + " é primo");
        } else {
            System.out.println("O numero " + valor + " não é primo");
        }
    }
}