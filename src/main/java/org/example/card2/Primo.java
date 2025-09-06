package org.example.card2;

public class Primo {

    public static boolean checaPrimo(int numero){
        boolean ehPrimo = true;
        int i = 2;

        while (i < numero){
            if (numero % i == 0){
                ehPrimo = false;
                break;
            }
            i++;
        }

        return ehPrimo;
    }
}
